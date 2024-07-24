package io.github.dqualizer.dqlang.types.rqa.definition.loadtest.parametrization

import com.fasterxml.jackson.annotation.JsonProperty

data class Parametrization(
  @JsonProperty("path_variables")
  val pathVariables: Set<PathVariable>? = HashSet(),

  @JsonProperty("url_parameter")
  val urlParameters: Set<UrlParameter>? = HashSet(),

  @JsonProperty("request_parameter")
  val requestParameter: Set<RequestParameter>? = HashSet(),

  val payload: Payload? = null
)
