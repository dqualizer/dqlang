package io.github.dqualizer.dqlang.messaging

import io.github.dqualizer.dqlang.test.MessagingConfiguration
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.SpyBean
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles


@SpringBootTest(classes = [AMQPAutoConfiguration::class, RabbitAutoConfiguration::class])//
@Import(MessagingConfiguration::class)
class AMQPAutoConfigurationTest {
    @Test
    fun loadsContextWithNoConfiguration() {}

    @Nested
    @ActiveProfiles("messaging")
    inner class FullyConfiguredTests {

        @SpyBean
        lateinit var amqpAdmin: AmqpAdmin

        @Test
        fun derp() {
            verify(amqpAdmin, times(5)).declareExchange(any())
            verify(amqpAdmin, times(2)).declareQueue(any())
            verify(amqpAdmin, times(1)).declareBinding(any())
        }
    }
}
