package io.github.dqualizer.dqlang.messaging

import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.core.*
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.config.AutowireCapableBeanFactory
import org.springframework.context.ApplicationContext

@Slf4j
class QueueFactory(
    private val applicationContext: ApplicationContext,
    private val amqpAdmin: AmqpAdmin,
    private val messagingConfiguration: MessagingConfiguration
) : InitializingBean {

    private val log: Logger = LoggerFactory.getLogger(QueueFactory::class.java)

    private val exchanges = mutableMapOf<String, Exchange>()

    private val queues = mutableMapOf<String, Queue>()

    override fun afterPropertiesSet() {
        val factory = applicationContext.autowireCapableBeanFactory

        createExchanges(factory)

        createAndBindQueues(factory)
    }


    private fun createExchanges(factory: AutowireCapableBeanFactory) {
        for (exchangeEntry in messagingConfiguration.exchanges) {
            val exchangeConfig = exchangeEntry.value
            val exchangeName = exchangeConfig.name.orElse(exchangeEntry.key)
            val durable = exchangeConfig.durable
            val autoDelete = exchangeConfig.autoDelete

            if (exchanges.containsKey(exchangeName)) {
                throw IllegalArgumentException("Exchange $exchangeName is defined at least twice.")
            }

            val exchange = when (exchangeConfig.exchangeType.lowercase()) {
                ExchangeTypes.DIRECT -> DirectExchange(exchangeName, durable, autoDelete)
                ExchangeTypes.FANOUT -> FanoutExchange(exchangeName, durable, autoDelete)
                ExchangeTypes.HEADERS -> HeadersExchange(exchangeName, durable, autoDelete)
                ExchangeTypes.TOPIC -> TopicExchange(exchangeName, durable, autoDelete)
                else -> throw IllegalArgumentException("${exchangeConfig.exchangeType} is not a viable exchange type. Allowed values are \"${ExchangeTypes.DIRECT}\", \"${ExchangeTypes.TOPIC}\", \"${ExchangeTypes.FANOUT}\", \"${ExchangeTypes.HEADERS}\".")
            }
            log.info("Declared exchange $exchange.")


            amqpAdmin.declareExchange(exchange)
            factory.autowireBean(exchange)
            factory.initializeBean(exchange, exchangeEntry.key)

            exchanges[exchangeName] = exchange
        }
    }

    private fun createAndBindQueues(factory: AutowireCapableBeanFactory) {
        for (queueEntry in messagingConfiguration.queues) {
            val queueConfig = queueEntry.value
            val queueName = queueConfig.name.orElse(queueEntry.key)

            if (queues.containsKey(queueName)) {
                throw IllegalArgumentException("Queue $queueName is defined at least twice.")
            }

            val queue = Queue(queueName, queueConfig.durable)
            amqpAdmin.declareQueue(queue)
            log.info("Declared Queue $queue (durable=${queue.isDurable}))")
            factory.autowireBean(queue)
            factory.initializeBean(queue, queueEntry.key)

            queues[queueName] = queue

            for (bindingConfig in queueConfig.bindings) {
                val exchange = exchanges.getOrElse(bindingConfig.exchange) {
                    throw IllegalArgumentException("Exchange ${bindingConfig.exchange} was not defined.")
                }

                val binding = BindingBuilder.bind(queue).to(exchange)
                    .with(bindingConfig.routingKey)
                    .and(bindingConfig.arguments)
                amqpAdmin.declareBinding(binding)
                factory.autowireBean(binding)
                factory.initializeBean(binding, "binding_${bindingConfig.exchange}_${queueName}")
            }
        }
    }


}
