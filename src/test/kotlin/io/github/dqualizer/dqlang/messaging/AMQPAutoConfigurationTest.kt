package io.github.dqualizer.dqlang.messaging

import io.github.dqualizer.dqlang.test.MessagingConfiguration
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.mockito.kotlin.argumentCaptor
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.core.Exchange
import org.springframework.amqp.core.Queue
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.SpyBean
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles


@SpringBootTest(classes = [AMQPAutoConfiguration::class, RabbitAutoConfiguration::class])//
@Import(MessagingConfiguration::class)
class AMQPAutoConfigurationTest {
    @Test
    fun loadsContextWithNoConfiguration() {
    }

    @Nested
    @ActiveProfiles("messaging")
    inner class FullyConfiguredTests {

        @SpyBean
        lateinit var amqpAdmin: AmqpAdmin

        @Test
        fun loadsConfigurationCorrectly() {
            verify(amqpAdmin, times(5)).declareExchange(any())
            verify(amqpAdmin, times(2)).declareQueue(any())
            verify(amqpAdmin, times(1)).declareBinding(any())

            //check names
            val nameCaptor = argumentCaptor<Exchange>()
            verify(amqpAdmin, times(5)).declareExchange(nameCaptor.capture())
            val names = nameCaptor.allValues.map { it.name }
            assertEquals("testExchange1", names[0])
            assertEquals("exchange2", names[1])
            assertEquals("exchange3", names[2])
            assertEquals("exchange4", names[3])
            assertEquals("exchange5", names[4])

            val queueCaptor = argumentCaptor<Queue>()
            verify(amqpAdmin, times(2)).declareQueue(queueCaptor.capture())
            val queueNames = queueCaptor.allValues.map { it.name }
            assertTrue(queueNames.contains("named-queue"))
            assertTrue(queueNames.contains("queue2"))
        }
    }
}
