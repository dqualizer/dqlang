package io.github.dqualizer.dqlang.types.rqa.configuration

import com.fasterxml.jackson.annotation.JsonPropertyDescription
import io.github.dqualizer.dqlang.types.rqa.configuration.loadtest.LoadTestConfiguration
import io.github.dqualizer.dqlang.types.rqa.configuration.monitoring.MonitoringConfiguration
import io.github.dqualizer.dqlang.types.rqa.configuration.resilience.ResilienceTestConfiguration

/**
 * @author Lion Wagner
 */
data class RQAConfiguration(
  /**
   * The name of the Bounded Context to which this load test belongs (Required)
   */
  @JsonPropertyDescription("The id of the Bounded Context to which this load test belongs")
  var context: String,

  /**
   * Version of this load test configuration (Required)
   */
  @JsonPropertyDescription("Version of this load test configuration")
  val version: Int = -1,

  var loadConfiguration: LoadTestConfiguration = LoadTestConfiguration(),

  var monitoringConfiguration: MonitoringConfiguration = MonitoringConfiguration(),

  var resilienceConfiguration: ResilienceTestConfiguration = ResilienceTestConfiguration()
)

