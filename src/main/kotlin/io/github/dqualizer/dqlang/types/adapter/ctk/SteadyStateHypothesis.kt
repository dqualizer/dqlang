package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonProperty

data class SteadyStateHypothesis(
  @JsonProperty("title")
  val title: String? = null,

  @JsonProperty("probes")
  val probes: List<Probe>? = null
)
