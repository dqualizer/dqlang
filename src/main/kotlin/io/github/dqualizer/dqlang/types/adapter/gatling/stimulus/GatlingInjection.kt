package io.github.dqualizer.dqlang.types.adapter.gatling.stimulus

import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.WorkloadType

data class GatlingInjection(

    val workloadType: WorkloadType,

    val profile: GatlingInjectionProfile
)
