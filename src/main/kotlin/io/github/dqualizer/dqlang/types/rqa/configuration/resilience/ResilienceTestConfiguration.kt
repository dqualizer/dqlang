package io.github.dqualizer.dqlang.types.rqa.configuration.resilience

import com.fasterxml.jackson.annotation.JsonProperty

data class ResilienceTestConfiguration(
  val version: String? = null,
  val context: String? = null,
  val environment: String? = null,

  @JsonProperty("resilience_tests")
  val resilienceTestArtifacts: Set<ResilienceTestArtifact> = emptySet()
)
