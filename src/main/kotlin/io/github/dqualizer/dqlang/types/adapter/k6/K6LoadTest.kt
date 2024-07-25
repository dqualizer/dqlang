package io.github.dqualizer.dqlang.types.adapter.k6

import io.github.dqualizer.dqlang.types.adapter.k6.options.Options
import io.github.dqualizer.dqlang.types.adapter.k6.request.Request

data class K6LoadTest(
  val repetition: Int? = 0,

  val options: Options? = null,

  val request: Request? = null
)
