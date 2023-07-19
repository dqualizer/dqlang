package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadIncrease {
    @JsonProperty("start_target")
    private val startTarget = 0

    @JsonProperty("end_target")
    private val endTarget = 0

    @JsonProperty("stages")
    private val stages = 0

    @JsonProperty("test_duration")
    private val testDuration: String? = null
    private val linear = 0
    private val quadratic = 0
    private val cubic = 0
}
