package io.github.dqualizer.dqlang.messaging

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import java.util.*

@Configuration
@ConfigurationProperties(prefix = "dqualizer.messaging")
class QueueConfiguration {
    data class QueueConfiguration(
        val name: Optional<String>,
        val durable: Boolean = false,
    )

    var queues: Map<String, QueueConfiguration> = mapOf()

}



