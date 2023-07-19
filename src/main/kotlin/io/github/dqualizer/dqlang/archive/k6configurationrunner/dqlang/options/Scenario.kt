package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.options

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "executor")
@JsonSubTypes(
    JsonSubTypes.Type(
        value = io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.ConstantScenario::class,
        name = "constant-vus"
    ), JsonSubTypes.Type(
        value = io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.RampingScenario::class,
        name = "ramping-vus"
    )
)
abstract class Scenario  
