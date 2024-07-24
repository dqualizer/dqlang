package io.github.dqualizer.dqlang.types.rqa.configuration.resilience

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact

data class ProcessArtifact(
  val artifact: Artifact,
  // used to kill process
  @JsonProperty("process_id")
  val processName: String,
  // used to eventually restart process
  @JsonProperty("process_path")
  val processPath: String
)
