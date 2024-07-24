package io.github.dqualizer.dqlang.types.adapter.k6

data class K6Configuration(
  val name: String? = null,

  val baseURL: String? = null,

  val k6LoadTests: Set<K6LoadTest>? = HashSet()
)
