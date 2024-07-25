package io.github.dqualizer.dqlang.types.adapter.constants.loadTest

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.adapter.accuracy.Accuracy
import io.github.dqualizer.dqlang.types.adapter.constants.SatisfactionValue
import io.github.dqualizer.dqlang.types.adapter.symbolics.Symbolics

/**
 * Java class for load test constants definitions
 */
data class LoadTestConstants(
  val accuracy: Accuracy,

  @JsonProperty("technical_constants")
  val technicalConstants: TechnicalConstants,

  val symbolics: Symbolics,

  @JsonProperty("response_time")
  val responseTime: SatisfactionValue
)
