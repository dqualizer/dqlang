package io.github.dqualizer.dqlang.types.adapter.constants

data class ResponseTime(
    val satisfied: Int,

    val tolerated: Int,

    val frustrated: Int
)
