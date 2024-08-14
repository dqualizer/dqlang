package io.github.dqualizer.dqlang.types.adapter.symbolics

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.adapter.symbolics.generic.SymbolicDurationType
import java.util.concurrent.TimeUnit

data class SymbolicDuration(
  val integer: SymbolicDurationType<Int>,

  val decimal: SymbolicDurationType<Double>,

  @JsonProperty("time_unit")
  val timeUnit: TimeUnit
)
