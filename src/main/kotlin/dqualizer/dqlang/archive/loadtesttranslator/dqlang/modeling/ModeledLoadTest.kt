package dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ModeledLoadTest {
    private val artifact: Artifact? = null
    private val description: String? = null
    private val stimulus: Stimulus? = null
    private val parametrization: Parametrization? = null

    @JsonProperty("response_measure")
    private val responseMeasure: ResponseMeasure? = null

    @JsonProperty("result_metrics")
    private val resultMetrics: LinkedHashSet<String>? = null
}
