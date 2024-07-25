package io.github.dqualizer.dqlang.types.adapter.symbolics

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.adapter.symbolics.generic.SymbolicLoadType
import java.util.concurrent.TimeUnit

data class SymbolicLoad(
  val integer: SymbolicLoadType<Int>,

  val decimal: SymbolicLoadType<Double>,

  /**
   * TimeUnit for open loads,
   * @example users per SECONDS, users per MINUTES
   */
  @JsonProperty("time_unit")
  val timeUnit: TimeUnit
)
