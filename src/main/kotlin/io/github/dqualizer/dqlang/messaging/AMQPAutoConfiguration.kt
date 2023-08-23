package io.github.dqualizer.dqlang.messaging

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class AMQPAutoConfiguration {
    @Bean
    fun messageConverter(): MessageConverter {
        return Jackson2JsonMessageConverter()
    }

    @Bean
    fun objectMapper(): ObjectMapper {
        return ObjectMapper()
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
