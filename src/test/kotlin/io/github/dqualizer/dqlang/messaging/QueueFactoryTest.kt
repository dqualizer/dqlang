package io.github.dqualizer.dqlang.messaging

import io.github.dqualizer.dqlang.messaging.MessagingConfiguration.ExchangeConfiguration
import io.github.dqualizer.dqlang.messaging.MessagingConfiguration.QueueConfiguration
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.ArgumentCaptor
import org.mockito.Mockito
import org.mockito.kotlin.*
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.core.ExchangeTypes
import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.config.AutowireCapableBeanFactory
import org.springframework.context.ApplicationContext
import java.util.*

class QueueFactoryTest {

    private var amqpAdmin: AmqpAdmin = mock<AmqpAdmin> { }
    private var beanFactory: AutowireCapableBeanFactory = mock<AutowireCapableBeanFactory> { }
    private var applicationContext: ApplicationContext =
        mock<ApplicationContext> { on { autowireCapableBeanFactory } doReturn beanFactory }


    @BeforeEach
    fun setUp() {
        Mockito.reset(beanFactory, applicationContext, amqpAdmin)

        applicationContext = mock<ApplicationContext> { on { autowireCapableBeanFactory } doReturn beanFactory }


    }

    private fun verifyCounts(queues: Int, exchanges: Int, bindings: Int) {
        verify(amqpAdmin, times(queues)).declareQueue(any())
        verify(amqpAdmin, times(exchanges)).declareExchange(any())
        verify(amqpAdmin, times(bindings)).declareBinding(any())

        verify(beanFactory, times(queues + exchanges + bindings)).autowireBean(any())
        verify(beanFactory, times(queues + exchanges + bindings)).initializeBean(any(), any())
    }

    @Test
    fun acceptsEmptyConfiguration() {
        QueueFactory(applicationContext, amqpAdmin, MessagingConfiguration())
            .afterPropertiesSet()
        verifyCounts(0, 0, 0)
    }

    @Test
    fun acceptsQueueWithoutExchange() {
        val messagingConfig = MessagingConfiguration(queues = mapOf(Pair("queue", QueueConfiguration())))

        QueueFactory(applicationContext, amqpAdmin, messagingConfig)
            .afterPropertiesSet()

        verifyCounts(1, 0, 0)
    }

    @Test
    fun acceptsMultipleQueuesWithoutExchange() {
        val messagingConfig = MessagingConfiguration(
            queues = mapOf(
                Pair("queue1", QueueConfiguration()),
                Pair("queue2", QueueConfiguration())
            )
        )
        QueueFactory(applicationContext, amqpAdmin, messagingConfig)
            .afterPropertiesSet()
        verifyCounts(2, 0, 0)
    }

    @Test
    fun usesKeyAsName() {
        val keyArgument = ArgumentCaptor.forClass(String::class.java)

        val queueKey = "queue"
        val messagingConfiguration = MessagingConfiguration(
            queues = mapOf(
                Pair(queueKey, QueueConfiguration(name = Optional.of("overwritten")))
            )
        )

        QueueFactory(applicationContext, amqpAdmin, messagingConfiguration)
            .afterPropertiesSet()
        verifyCounts(1, 0, 0)

        verify(beanFactory).initializeBean(any(), keyArgument.capture())
        assertEquals(queueKey, keyArgument.value)
    }

    @Test
    fun usesOverwrittenName() {
        val queueArgument = ArgumentCaptor.forClass(Queue::class.java)

        val queueName = "overwritten"
        val messagingConfiguration = MessagingConfiguration(
            queues = mapOf(
                Pair("queue", QueueConfiguration(name = Optional.of(queueName)))
            )
        )

        QueueFactory(applicationContext, amqpAdmin, messagingConfiguration)
            .afterPropertiesSet()
        verifyCounts(1, 0, 0)

        verify(amqpAdmin).declareQueue(queueArgument.capture())
        assertEquals(queueName, queueArgument.value.name)
    }

    @Test

    fun throwsOnDuplicatedQueueNames() {
        assertThrows<IllegalArgumentException> {
            val queueName = "exists_twice"
            val messagingConfiguration = MessagingConfiguration(
                queues = mapOf(
                    Pair("queue", QueueConfiguration(name = Optional.of(queueName))),
                    Pair("queue2", QueueConfiguration(name = Optional.of(queueName)))
                )
            )
            QueueFactory(applicationContext, amqpAdmin, messagingConfiguration)
                .afterPropertiesSet()
            verifyCounts(2, 0, 0)
        }
    }

    @Test
    fun throwsOnNonExistingExchange() {
        assertThrows<IllegalArgumentException> {
            val messagingConfiguration = MessagingConfiguration(
                queues = mapOf(
                    Pair(
                        "queue", QueueConfiguration(
                            bindings = listOf(
                                MessagingConfiguration.BindingConfiguration(
                                    routingKey = "key",
                                    exchange = "non_existing_exchange"
                                )
                            )
                        )
                    )
                ),
            )

            QueueFactory(applicationContext, amqpAdmin, messagingConfiguration)
                .afterPropertiesSet()

        }
    }

    @Test
    fun acceptsExchange() {
        val messagingConfig = MessagingConfiguration(exchanges = mapOf(Pair("exchange", ExchangeConfiguration())))
        val factory = QueueFactory(applicationContext, amqpAdmin, messagingConfig)
        factory.afterPropertiesSet()
        verifyCounts(0, 1, 0)
    }

    @Test
    fun acceptsMultipleExchanges() {
        val messagingConfig = MessagingConfiguration(
            exchanges = mapOf(
                Pair("exchange", ExchangeConfiguration()),
                Pair("exchange2", ExchangeConfiguration())
            )
        )
        val factory = QueueFactory(applicationContext, amqpAdmin, messagingConfig)
        factory.afterPropertiesSet()
        verifyCounts(0, 2, 0)
    }

    @Test
    fun canCreateAllExchangeTypes() {
        val messagingConfig = MessagingConfiguration(
            exchanges = mapOf(
                Pair("exchange", ExchangeConfiguration(exchangeType = ExchangeTypes.DIRECT)),
                Pair("exchange2", ExchangeConfiguration(exchangeType = ExchangeTypes.FANOUT)),
                Pair("exchange3", ExchangeConfiguration(exchangeType = ExchangeTypes.HEADERS)),
                Pair("exchange4", ExchangeConfiguration(exchangeType = ExchangeTypes.TOPIC))
            )
        )
        val factory = QueueFactory(applicationContext, amqpAdmin, messagingConfig)
        factory.afterPropertiesSet()
        verifyCounts(0, 4, 0)
    }

    @Test
    fun throwsOnNonWrongExchangeType() {
        assertThrows<IllegalArgumentException> {
            val messagingConfig = MessagingConfiguration(
                exchanges = mapOf(Pair("exchange", ExchangeConfiguration(exchangeType = "i don't exist")))
            )
            val factory = QueueFactory(applicationContext, amqpAdmin, messagingConfig)
            factory.afterPropertiesSet()
            verifyCounts(0, 1, 0)
        }
    }

    @Test
    fun usesKeyAsExchangeName() {
        val keyArgument = ArgumentCaptor.forClass(String::class.java)

        val exchangeKey = "exchange"
        val messagingConfiguration = MessagingConfiguration(
            exchanges = mapOf(
                Pair(exchangeKey, ExchangeConfiguration(name = Optional.of("overwritten")))
            )
        )

        QueueFactory(applicationContext, amqpAdmin, messagingConfiguration)
            .afterPropertiesSet()
        verifyCounts(0, 1, 0)

        verify(beanFactory).initializeBean(any(), keyArgument.capture())
        assertEquals(exchangeKey, keyArgument.value)
    }

    @Test
    fun acceptsOverwrittenExchangeName() {
        val exchangeArgument = ArgumentCaptor.forClass(org.springframework.amqp.core.Exchange::class.java)

        val exchangeName = "overwritten"
        val messagingConfiguration = MessagingConfiguration(
            exchanges = mapOf(
                Pair("exchange", ExchangeConfiguration(name = Optional.of(exchangeName)))
            )
        )

        QueueFactory(applicationContext, amqpAdmin, messagingConfiguration)
            .afterPropertiesSet()
        verifyCounts(0, 1, 0)

        verify(amqpAdmin).declareExchange(exchangeArgument.capture())
        assertEquals(exchangeName, exchangeArgument.value.name)

    }

    @Test
    fun throwsOnDuplicatedExchangeNames() {
        assertThrows<IllegalArgumentException> {
            val exchangeName = "exists_twice"
            val messagingConfiguration = MessagingConfiguration(
                exchanges = mapOf(
                    Pair("exchange", ExchangeConfiguration(name = Optional.of(exchangeName))),
                    Pair("exchange2", ExchangeConfiguration(name = Optional.of(exchangeName)))
                )
            )
            QueueFactory(applicationContext, amqpAdmin, messagingConfiguration)
                .afterPropertiesSet()
            verifyCounts(0, 2, 0)
        }
    }
}
