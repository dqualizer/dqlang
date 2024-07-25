package io.github.dqualizer.dqlang.types.rqa.configuration.resilience

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact

data class CmsbArtifact(
  val artifact: Artifact,
  @JsonProperty("base_url")
  val baseUrl: String,
  @JsonProperty("package_member")
  val packageMember: String
)
