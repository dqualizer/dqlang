package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class LoadTest {
    val artifact: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.Artifact? = null
    val description: String? = null
    val stimulus: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.Stimulus? = null

    @JsonProperty("response_measure")
    val responseMeasure: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.ResponseMeasure? = null
    val endpoint: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.Endpoint? = null
}
