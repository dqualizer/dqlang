package io.github.dqualizer.dqlang.types.adapter.gatling.action

data class GatlingAction (

    val name: String,

    val request: GatlingRequest,

    val params: GatlingParams,

    val checks: GatlingChecks
)
