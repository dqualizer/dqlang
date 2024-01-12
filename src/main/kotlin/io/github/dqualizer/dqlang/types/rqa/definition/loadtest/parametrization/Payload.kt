package io.github.dqualizer.dqlang.types.rqa.definition.loadtest.parametrization

import java.util.*

data class Payload (
    val name: String? = null,

    val scenarios: List<Scenario>? = LinkedList()
)
