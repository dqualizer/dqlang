package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.ALWAYS)
data class Action(
  override val type: String = "action",

  val pauses: Pauses? = null,

  override val name: String,

  override val provider: Provider
) : Probe(name = name, provider = provider)
