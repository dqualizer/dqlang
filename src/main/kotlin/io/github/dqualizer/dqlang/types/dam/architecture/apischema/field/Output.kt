package io.github.dqualizer.dqlang.types.dam.architecture.apischema.field

import com.fasterxml.jackson.annotation.JsonProperty

data class Output(
  val type: String? = null,

  @JsonProperty("expected_code")
  val expectedCode: String? = null,
)
