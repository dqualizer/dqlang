package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ModeledLoadTest {
    private val artifact: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Artifact? = null
    private val description: String? = null
    private val stimulus: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Stimulus? = null
    private val parametrization: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Parametrization? = null

    @JsonProperty("response_measure")
    private val responseMeasure: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ResponseMeasure? = null

    @JsonProperty("result_metrics")
    private val resultMetrics: LinkedHashSet<String>? = null
}
