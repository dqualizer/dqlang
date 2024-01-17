package io.github.dqualizer.dqlang.types.adapter.gatling.action

data class GatlingParams (

    val requestParams: String? = "",

    val payload: String? = "",

    val pathVariables: String? = "",

    val queryParams: String? = ""
)
