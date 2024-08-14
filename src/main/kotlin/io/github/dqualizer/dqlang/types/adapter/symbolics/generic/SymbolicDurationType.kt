package io.github.dqualizer.dqlang.types.adapter.symbolics.generic

import com.fasterxml.jackson.annotation.JsonProperty

data class SymbolicDurationType<T>(
  val slow: T,

  val fast: T,

  @JsonProperty("very_fast")
  val veryFast: T,
)
