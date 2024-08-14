package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.databind.JsonNode

data class SteadyStateProbe(
  override val name: String,
  override val provider: Provider,
  val tolerance: JsonNode
) : Probe(name = name, provider = provider)
