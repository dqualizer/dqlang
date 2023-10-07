package io.github.dqualizer.dqlang.messaging

import org.springframework.amqp.core.ExchangeTypes
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@ConfigurationProperties(prefix = "dqualizer.messaging")
@ConditionalOnProperty(prefix = "dqualizer", name = ["messaging"])
data class MessagingConfiguration(
    var queues: Map<String, QueueConfiguration> = mapOf(),
    var exchanges: Map<String, ExchangeConfiguration> = mapOf()
) {
    data class BindingConfiguration(
        val routingKey: String,
        val exchange: String,
        val arguments: Map<String, Any> = mapOf()
    )

    data class QueueConfiguration(
        val name: Optional<String> = Optional.empty(),
        val durable: Boolean = true,
        val bindings: List<BindingConfiguration> = listOf()
    )

    data class ExchangeConfiguration(
        val name: Optional<String> = Optional.empty(),
        val exchangeType: String = ExchangeTypes.DIRECT,
        val durable: Boolean = true,
        val autoDelete: Boolean = false
    )
}
