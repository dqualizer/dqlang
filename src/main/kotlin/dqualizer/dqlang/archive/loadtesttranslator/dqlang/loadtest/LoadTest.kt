package dqualizer.dqlang.archive.loadtesttranslator.dqlang.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Endpoint
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Artifact
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ResponseMeasure
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Stimulus
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class LoadTest {
    private val artifact: Artifact? = null
    private val description: String? = null
    private val stimulus: Stimulus? = null

    @JsonProperty("response_measure")
    private val responseMeasure: ResponseMeasure? = null
    private val endpoint: Endpoint? = null
}
