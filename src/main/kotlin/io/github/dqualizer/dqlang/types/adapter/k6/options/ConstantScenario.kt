package io.github.dqualizer.dqlang.types.adapter.k6.options

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("constant-vus")
data class ConstantScenario @JsonCreator constructor(
    val executor: String = "constant-vus",

    val vus: Int? = 0,

    val duration: String? = null
) : Scenario()
