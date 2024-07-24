package io.github.dqualizer.dqlang.types.adapter.gatling

import io.github.dqualizer.dqlang.types.adapter.constants.loadTest.TechnicalConstants
import java.util.*

data class GatlingConfiguration(

  val context: String? = null,

  val baseURL: String? = null,

  val technicalConstants: TechnicalConstants? = null,

  val loadTest: List<GatlingLoadTest>? = LinkedList()
)
