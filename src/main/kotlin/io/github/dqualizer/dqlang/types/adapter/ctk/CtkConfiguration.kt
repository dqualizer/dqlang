package io.github.dqualizer.dqlang.types.adapter.ctk

data class CtkConfiguration(
  val name: String? = null,
  val ctkChaosExperiments: Set<CtkChaosExperiment> = emptySet()
)
