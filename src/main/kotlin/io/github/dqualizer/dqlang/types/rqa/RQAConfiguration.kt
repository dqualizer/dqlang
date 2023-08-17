package io.github.dqualizer.dqlang.types.rqa

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import io.github.dqualizer.dqlang.types.instrumentation.InstrumentationFramework
import io.github.dqualizer.dqlang.types.instrumentation.MonitoringConfiguration
import io.github.dqualizer.dqlang.types.instrumentation.ServiceMonitoringConfiguration
import io.github.dqualizer.dqlang.types.load_test_configuration.LoadTestConfiguration

/**
 * @author Lion Wagner
 */
class RQAConfiguration {

    /**
     * Version of this load test configuration (Required)
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of this load test configuration")
    var version: Int = -1

    /**
     * The name of the Bounded Context to which this load test belongs (Required)
     */
    @JsonProperty("context_id")
    @JsonPropertyDescription("The id of the Bounded Context to which this load test belongs")
    lateinit var context: String

    lateinit var loadConfiguration: LoadTestConfiguration

   lateinit var monitoringConfiguration: MonitoringConfiguration

    //private lateinit var chaosConfiguration : ChaosConfiguration
}

