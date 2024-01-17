package io.github.dqualizer.dqlang.types.adapter.gatling

import io.github.dqualizer.dqlang.types.adapter.constants.TechnicalConstants
import java.util.LinkedList

data class GatlingConfiguration (

    val context: String? = null,

    val baseURL: String? = null,

    val technicalConstants: TechnicalConstants? = null,

    val loadTest: List<GatlingLoadTest>? = LinkedList()
)
