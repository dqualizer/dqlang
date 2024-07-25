package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonProperty

data class Secrets(
  @JsonProperty("authentication")
  val authenticationSecret: AuthenticationSecret? = null
)
