package io.github.dqualizer.dqlang.types.adapter.symbolics.generic

data class SymbolicLoadType<T>(
    val low: T,

    val medium: T,

    val high: T,
)
