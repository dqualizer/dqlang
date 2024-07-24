package io.github.dqualizer.dqlang.types.rqa.definition.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Satisfaction

data class ResponseMeasures(
  @JsonProperty("response_time")
  val responseTime: Satisfaction? = null
)
