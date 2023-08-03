package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadPeak {
    @JsonProperty("min_repetitions")
    val minRepetition = 0

    @JsonProperty("max_repetitions")
    val maxRepetition = 0
    val high = 0

    @JsonProperty("very_high")
    val veryHigh = 0

    @JsonProperty("extremely_high")
    val extremelyHigh = 0
    val slow: String? = null
    val fast: String? = null

    @JsonProperty("very_fast")
    val veryFast: String? = null

    @JsonProperty("cool_down_duration")
    val coolDownDuration: String? = null
}
