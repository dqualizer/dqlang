package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonProperty

data class Provider(
  @JsonProperty("type") var type: String? = null,
  @JsonProperty("module") var module: String? = null,
  @JsonProperty("func") var function: String? = null,
  @JsonProperty("arguments") var arguments: Map<String, Any>? = null
)
