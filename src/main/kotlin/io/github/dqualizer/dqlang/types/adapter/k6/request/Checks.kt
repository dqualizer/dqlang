package io.github.dqualizer.dqlang.types.adapter.k6.request

import com.fasterxml.jackson.annotation.JsonProperty

data class Checks(
  @JsonProperty("status_codes")
  val statusCodes: Set<Int>? = null,

  val duration: Int? = 0
)

