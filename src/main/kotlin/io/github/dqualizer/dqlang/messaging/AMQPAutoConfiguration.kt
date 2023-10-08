package io.github.dqualizer.dqlang.messaging

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.github.dqualizer.dqlang.messaging.MessagingConfiguration.ExchangeConfiguration
import io.github.dqualizer.dqlang.messaging.MessagingConfiguration.QueueConfiguration
import org.springframework.amqp.core.AmqpAdmin
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter
import java.lang.module.ModuleDescriptor


@Configuration
class AMQPAutoConfiguration {

    @Bean
    fun objectMapper(): ObjectMapper {
        val convertModule = SimpleModule("dqlang_converter")
            .addSerializer(ModuleDescriptor.Version::class.java, VersionSerializer())
            .addDeserializer(ModuleDescriptor.Version::class.java, VersionDeserializer())

        return ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false)
            .registerModule(convertModule)
            .registerKotlinModule()
    }

    @Bean
    fun messageConverter(mapper: ObjectMapper): MessageConverter {
        return Jackson2JsonMessageConverter(mapper)
    }

    @Bean
    fun messagingConfiguration(): MessagingConfiguration {
        return MessagingConfiguration()
    }

    @Bean
    @ConditionalOnBean(MessagingConfiguration::class)
    fun queueFactory(
        applicationContext: ApplicationContext,
        messagingConfiguration: MessagingConfiguration,
        rabbitAdmin: AmqpAdmin
    ): QueueFactory {
        return QueueFactory(applicationContext, rabbitAdmin, messagingConfiguration)
    }

    @Suppress("ObjectLiteralToLambda")
    @Bean
    @ConfigurationPropertiesBinding //tell Spring to load this bean before loading Properties
    @ConditionalOnBean(MessagingConfiguration::class)
    fun queueConfigurationConverter(): Converter<String, QueueConfiguration> {
        // This has to be an explicit object. Otherwise, the generic type arguments get erased.
        // See https://github.com/spring-projects/spring-framework/issues/22509
        return object : Converter<String, QueueConfiguration> {
            override fun convert(propertyStr: String): QueueConfiguration {
                if (propertyStr.isBlank()) {
                    return QueueConfiguration()
                } else {
                    throw IllegalArgumentException("$propertyStr is not a valid value for ${QueueConfiguration::class.qualifiedName}. Expected a blank string or a map with properties.")
                }
            }
        }
    }

    @Suppress("ObjectLiteralToLambda")
    @Bean
    @ConfigurationPropertiesBinding //tell Spring to load this bean before loading Properties
    @ConditionalOnBean(MessagingConfiguration::class)
    fun exchangeConfigurationConverter(): Converter<String, ExchangeConfiguration> {
        // This has to be an explicit object. Otherwise, the generic type arguments get erased.
        // See https://github.com/spring-projects/spring-framework/issues/22509
        return object : Converter<String, ExchangeConfiguration> {
            override fun convert(propertyStr: String): ExchangeConfiguration {
                if (propertyStr.isBlank()) {
                    return ExchangeConfiguration()
                } else {
                    throw IllegalArgumentException("$propertyStr is not a valid value for ${ExchangeConfiguration::class.qualifiedName}. Expected a blank string or a map with properties.")
                }
            }
        }
    }
}
