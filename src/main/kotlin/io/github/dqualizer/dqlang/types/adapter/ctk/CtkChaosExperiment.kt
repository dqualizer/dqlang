package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription

data class CtkChaosExperiment(
  @JsonPropertyDescription("Title for this CTK Chaos Experiment")
  val title: String,

  @JsonPropertyDescription("Description for this CTK Chaos Experiment")
  val description: String? = null,

  val secrets: Secrets? = null,

  @JsonProperty(value = "steady-state-hypothesis", required = false)
  val steadyStateHypothesis: SteadyStateHypothesis? = null,

  val method: List<Probe>? = null,

  val rollbacks: List<Action>? = null,

  val extensions: List<ResponseMeasuresExtension> = emptyList(),

  val runtime: Runtime? = null
)
