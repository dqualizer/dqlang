package io.github.dqualizer.dqlang.types.adapter.symbolics.generic

import com.fasterxml.jackson.annotation.JsonProperty

data class SymbolicLoadType<T>(
  val low: T,

  val medium: T,

  val high: T,

  @JsonProperty("very_high")
  val veryHigh: T,

  @JsonProperty("extremely_high")
  val extremelyHigh: T
)
