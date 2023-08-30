package io.github.dqualizer.dqlang.messaging

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.lang.module.ModuleDescriptor.Version


@Configuration
class AMQPAutoConfiguration {
    @Bean
    fun objectMapper(): ObjectMapper {
        val convertModule = SimpleModule("dqlang_converter")
        convertModule.addDeserializer(Version::class.java, VersionDeserializer())
        convertModule.addSerializer(Version::class.java, VersionSerializer())

        return ObjectMapper()
    }

    @Bean
    fun messageConverter(objectMapper: ObjectMapper): MessageConverter {
        return Jackson2JsonMessageConverter(objectMapper)
    }

    @Bean
    fun queueConfiguration(): QueueConfiguration {
        return QueueConfiguration()
    }

    @Bean
    fun queueFactory(
        applicationContext: ApplicationContext,
        queueConfiguration: QueueConfiguration,
        rabbitAdmin: AmqpAdmin
    ): QueueFactory {
        return QueueFactory(applicationContext, queueConfiguration, rabbitAdmin)
    }

}
