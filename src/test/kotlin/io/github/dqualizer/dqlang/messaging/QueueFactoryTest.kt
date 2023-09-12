package io.github.dqualizer.dqlang.messaging

import io.github.dqualizer.dqlang.messaging.MessagingConfiguration.ExchangeConfiguration
import io.github.dqualizer.dqlang.messaging.MessagingConfiguration.QueueConfiguration
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.*
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.beans.factory.config.AutowireCapableBeanFactory
import org.springframework.context.ApplicationContext

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

    @Test
    fun acceptsEmptyConfiguration() {
        val factory = QueueFactory(applicationContext, amqpAdmin, MessagingConfiguration())
    }

    @Test
    fun acceptsQueueWithoutExchange() {
        val messagingConfig = MessagingConfiguration(queues = mapOf(Pair("queue", QueueConfiguration())))
        val factory = QueueFactory(applicationContext, amqpAdmin, messagingConfig)
        factory.afterPropertiesSet()

        verify(amqpAdmin, times(1)).declareQueue(any())
    }

    @Test
    fun acceptsMultipleQueuesWithoutExchange() {
        val messagingConfig = MessagingConfiguration(
            queues = mapOf(
                Pair("queue1", QueueConfiguration()),
                Pair("queue2", QueueConfiguration())
            )
        )
        val factory = QueueFactory(applicationContext, amqpAdmin, messagingConfig)
        factory.afterPropertiesSet()

        verify(amqpAdmin, times(2)).declareQueue(any())
    }

    @Test
    fun acceptsOverwrittenQueueName() {

    }

    @Test
    fun throwsOnDuplicatedQueueNames() {

    }

    @Test
    fun throwsOnNonExistingExchange() {

    }

    @Test
    fun acceptsExchange() {
        val messagingConfig = MessagingConfiguration(exchanges = mapOf(Pair("exchange", ExchangeConfiguration())))
        val factory = QueueFactory(applicationContext, amqpAdmin, messagingConfig)
        factory.afterPropertiesSet()
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
    }

    @Test
    fun canCreateAllExchangeTypes() {

    }

    @Test
    fun acceptsOverwrittenExchangeName() {

    }

    @Test
    fun throwsOnDuplicatedExchangeNames() {

    }

    @Test
    fun throwsOnNonWrongExchangeType() {

    }
}