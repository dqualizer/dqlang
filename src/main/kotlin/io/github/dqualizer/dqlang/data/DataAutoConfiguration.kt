package io.github.dqualizer.dqlang.data

import com.mongodb.ConnectionString
import com.mongodb.MongoClientSettings
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
  @Value("\${spring.data.mongodb.uri}")
  private lateinit var uri: String

  @Value("\${spring.data.mongodb.database:dqualizer}")
  private lateinit var databaseName: String

  override fun getDatabaseName(): String {
    return databaseName
  }

  override fun configureClientSettings(builder: MongoClientSettings.Builder) {
    // customization hook
    builder.applyConnectionString(ConnectionString(uri))
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
