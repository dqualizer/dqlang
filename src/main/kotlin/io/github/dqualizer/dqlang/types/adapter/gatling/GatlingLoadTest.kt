package io.github.dqualizer.dqlang.types.adapter.gatling

import io.github.dqualizer.dqlang.types.adapter.gatling.action.GatlingAction
import io.github.dqualizer.dqlang.types.adapter.gatling.stimulus.GatlingStimulus

data class GatlingLoadTest (

    val repetition: Int,

    val stimulus: GatlingStimulus,

    val actions: List<GatlingAction>
)
