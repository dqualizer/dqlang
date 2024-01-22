package io.github.dqualizer.dqlang.types.adapter.k6.options

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("ramping-vus")
data class RampingK6Scenario @JsonCreator constructor(
    val executor: String = "ramping-vus",

    val startVUs: Int = 0,

    val stages: Set<Stage>? = HashSet()
) : K6Scenario()

