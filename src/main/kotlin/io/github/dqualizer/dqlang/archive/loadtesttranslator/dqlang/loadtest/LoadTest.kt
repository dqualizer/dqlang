package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Endpoint
import io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Artifact
import io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ResponseMeasure
import io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Stimulus
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class LoadTest {
    private val artifact: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Artifact? = null
    private val description: String? = null
    private val stimulus: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Stimulus? = null

    @JsonProperty("response_measure")
    private val responseMeasure: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ResponseMeasure? = null
    private val endpoint: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Endpoint? = null
}
