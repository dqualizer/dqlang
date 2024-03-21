package io.github.dqualizer.dqlang.data

import com.mongodb.MongoClientSettings
import org.bson.UuidRepresentation
import org.bson.codecs.configuration.CodecRegistries.fromCodecs
import org.bson.codecs.configuration.CodecRegistries.fromRegistries
import org.bson.codecs.configuration.CodecRegistry
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import org.springframework.data.mongodb.core.convert.MongoCustomConversions
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@Configuration
@ComponentScan(basePackages = ["io.github.dqualizer.dqlang.data"])
@EnableMongoRepositories(basePackages = ["io.github.dqualizer.dqlang.data"])
class DataAutoConfiguration : AbstractMongoClientConfiguration() {

    @Value("\${spring.data.mongodb.database:dqualizer}")
    private lateinit var databaseName: String

    override fun getDatabaseName(): String {
        return databaseName
    }

    override fun configureConverters(converterConfigurationAdapter: MongoCustomConversions.MongoConverterConfigurationAdapter) {
        converterConfigurationAdapter.registerConverters(
            listOf(
                VersionReadConverter(),
                VersionWriteConverter()
            )
        )
    }
}
