package io.github.dqualizer.dqlang.messaging

import lombok.extern.slf4j.Slf4j
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.InitializingBean
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Component
@Slf4j
class QueueFactory(
    val applicationContext: ApplicationContext,
    val queueConfiguration: QueueConfiguration,
    val rabbitAdmin: AmqpAdmin
) : InitializingBean {

    val log: Logger = LoggerFactory.getLogger(QueueFactory::class.java)

    override fun afterPropertiesSet() {
        val factory = applicationContext.autowireCapableBeanFactory

        for (queueConfig in queueConfiguration.queues) {
            val queueName = queueConfig.value.name.orElse(queueConfig.key)

            val queue = Queue(queueName, queueConfig.value.durable)
            rabbitAdmin.declareQueue(queue)

            log.info("Declared Queue $queue (durable=${queue.isDurable}))")

            factory.autowireBean(queue)
            factory.initializeBean(queue, queueConfig.key)
        }
    }
}
