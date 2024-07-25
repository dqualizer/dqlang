package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class Runtime(
  @JsonProperty("rollbacks")
  var rollbacksStrategy: Strategy? = null,

  @JsonProperty("hypothesis")
  var hypothesisStrategy: Strategy? = null
)
