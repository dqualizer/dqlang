package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

import lombok.Getter
import lombok.ToString

@Getter
@ToString
class RuntimeQualityAnalysis {
    val monitoring: LinkedHashSet<Any>? = null
    val resilience: LinkedHashSet<Any>? = null
    val loadtests: LinkedHashSet<io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ModeledLoadTest>? = null
}
