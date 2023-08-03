package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ModeledLoadTest {
    val artifact: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Artifact? = null
    val description: String? = null
    val stimulus: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Stimulus? = null
    val parametrization: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Parametrization? = null

    @JsonProperty("response_measure")
    val responseMeasure: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ResponseMeasure? = null

    @JsonProperty("result_metrics")
    val resultMetrics: LinkedHashSet<String>? = null
}
