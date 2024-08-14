package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonProperty

data class AuthenticationSecret(
  val username: String? = null,
  val password: String? = null,

  @JsonProperty("db_username")
  val dbUsername: String? = null,

  @JsonProperty("db_password")
  val dbPassword: String? = null
)
