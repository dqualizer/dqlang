package io.github.dqualizer.dqlang.types.rqa.definition.resilience

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Satisfaction

data class ResilienceResponseMeasures(
  //  Response measures not allowed for certain stimuli (e.g. Late Responses stimulus combined with recovery time response measure) should be disallowed in the dqAnalyzer
  @JsonProperty(value = "recovery_time", required = false)
  val recoveryTime: Satisfaction? = null,

  @JsonProperty(value = "error_rate", required = false)
  val errorRate: Satisfaction? = null,

  @JsonProperty(value = "response_time", required = false)
  val responseTime: Satisfaction? = null
)
