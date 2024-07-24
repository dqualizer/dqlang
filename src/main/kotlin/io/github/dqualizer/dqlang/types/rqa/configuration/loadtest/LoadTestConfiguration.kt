package io.github.dqualizer.dqlang.types.rqa.configuration.loadtest

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Class for the general dqualizer loadtest configuration
 */
data class LoadTestConfiguration(
  val version: String? = null,
  val context: String? = null,
  val environment: String? = null,

  @JsonProperty("base_url")
  val baseURL: String? = null,

  @JsonProperty("load_tests")
  val loadTestArtifacts: Set<LoadTestArtifact>? = HashSet()
)

