package dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

import lombok.Getter
import lombok.ToString

@Getter
@ToString
class RuntimeQualityAnalysis {
    private val monitoring: LinkedHashSet<Any>? = null
    private val resilience: LinkedHashSet<Any>? = null
    private val loadtests: LinkedHashSet<ModeledLoadTest>? = null
}
