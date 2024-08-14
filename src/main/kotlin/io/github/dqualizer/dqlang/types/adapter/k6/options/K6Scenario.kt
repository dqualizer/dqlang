package io.github.dqualizer.dqlang.types.adapter.k6.options

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "executor")
@JsonSubTypes(
  JsonSubTypes.Type(value = ConstantK6Scenario::class, name = "constant-vus"),
  JsonSubTypes.Type(value = RampingK6Scenario::class, name = "ramping-vus")
)
sealed class K6Scenario
