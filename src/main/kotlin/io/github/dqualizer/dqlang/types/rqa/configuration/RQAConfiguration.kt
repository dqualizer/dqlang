package io.github.dqualizer.dqlang.types.rqa.configuration

import com.fasterxml.jackson.annotation.JsonPropertyDescription
import io.github.dqualizer.dqlang.types.rqa.configuration.loadtest.LoadTestConfiguration
import io.github.dqualizer.dqlang.types.rqa.configuration.monitoring.MonitoringConfiguration
import lombok.Builder

@Builder
data class RQAConfiguration(
    /**
     * Version of this load test configuration (Required)
     */
    @JsonPropertyDescription("Version of this load test configuration")
    val version: Int = -1,

    /**
     * The name of the Bounded Context to which this load test belongs (Required)
     */
    @JsonPropertyDescription("The id of the Bounded Context to which this load test belongs")
    val context: String,

    val loadConfiguration: LoadTestConfiguration,

    val monitoringConfiguration: MonitoringConfiguration,

    //val chaosConfiguration : ChaosConfiguration
)

