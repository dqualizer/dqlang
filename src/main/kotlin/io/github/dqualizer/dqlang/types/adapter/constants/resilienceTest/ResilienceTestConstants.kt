package io.github.dqualizer.dqlang.types.adapter.constants.resilienceTest

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.adapter.constants.SatisfactionValue

data class ResilienceTestConstants(
  @JsonProperty("recovery_time")
  val recoveryTime: SatisfactionValue? = null,

  @JsonProperty("response_time")
  val responseTime: SatisfactionValue? = null,

  @JsonProperty("error_rate")
  val errorRate: SatisfactionValue? = null
)
