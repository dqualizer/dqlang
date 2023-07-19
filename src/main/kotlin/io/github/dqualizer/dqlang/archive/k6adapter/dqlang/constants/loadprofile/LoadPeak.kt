package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadPeak {
    @JsonProperty("min_repetitions")
    private val minRepetition = 0

    @JsonProperty("max_repetitions")
    private val maxRepetition = 0
    private val high = 0

    @JsonProperty("very_high")
    private val veryHigh = 0

    @JsonProperty("extremely_high")
    private val extremelyHigh = 0
    private val slow: String? = null
    private val fast: String? = null

    @JsonProperty("very_fast")
    private val veryFast: String? = null

    @JsonProperty("cool_down_duration")
    private val coolDownDuration: String? = null
}
