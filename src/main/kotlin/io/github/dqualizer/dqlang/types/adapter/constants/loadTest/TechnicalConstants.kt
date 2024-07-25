package io.github.dqualizer.dqlang.types.adapter.constants.loadTest

import com.fasterxml.jackson.annotation.JsonProperty

data class TechnicalConstants(
  @JsonProperty("warm_up_duration")
  val warmUpDuration: Int,

  @JsonProperty("cool_down_duration")
  val coolDownDuration: Int,

  @JsonProperty("think_time")
  val thinkTime: Int
)
