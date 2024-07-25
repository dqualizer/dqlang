package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonProperty


data class ResponseDescription(
  val format: String,
  @JsonProperty("expected_status_codes")
  val expectedStatusCodes: Set<Int> = emptySet()
)
