package io.github.dqualizer.dqlang.types.adapter.k6.request

import com.fasterxml.jackson.annotation.JsonProperty

data class Request(
  val type: String? = null,

  val path: String? = null,

  @JsonProperty("path_variables")
  val pathVariables: Map<String, String>? = null,

  @JsonProperty("query_params")
  val queryParams: Map<String, String>? = null,

  val params: Map<String, String>? = null,

  val payload: Map<String, String>? = null,

  val checks: Checks? = null
)
