package io.github.dqualizer.dqlang.types.dam.architecture.apischema.data

data class DataSchema(
  val type: String? = null,
  val properties: Set<Property>? = HashSet()
)
