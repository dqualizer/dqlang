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
    val artifact: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Artifact? = null
    val description: String? = null
    val stimulus: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Stimulus? = null

    @JsonProperty("response_measure")
    val responseMeasure: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ResponseMeasure? = null
    val endpoint: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Endpoint? = null
}
