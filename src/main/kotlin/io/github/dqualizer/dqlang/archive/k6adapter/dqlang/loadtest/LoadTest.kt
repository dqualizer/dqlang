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
    private val artifact: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.Artifact? = null
    private val description: String? = null
    private val stimulus: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.Stimulus? = null

    @JsonProperty("response_measure")
    private val responseMeasure: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.ResponseMeasure? = null
    private val endpoint: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.Endpoint? = null
}
