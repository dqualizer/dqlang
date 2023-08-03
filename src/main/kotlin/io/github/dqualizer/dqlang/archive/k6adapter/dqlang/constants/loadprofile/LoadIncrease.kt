package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadIncrease {
    @JsonProperty("start_target")
    val startTarget = 0

    @JsonProperty("end_target")
    val endTarget = 0

    @JsonProperty("stages")
    val stages = 0

    @JsonProperty("test_duration")
    val testDuration: String? = null
    val linear = 0
    val quadratic = 0
    val cubic = 0
}
