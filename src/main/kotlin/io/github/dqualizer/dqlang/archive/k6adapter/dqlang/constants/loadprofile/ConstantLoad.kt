package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ConstantLoad {
    val low = 0
    val medium = 0
    val high = 0

    @JsonProperty("min_duration")
    @JsonPropertyDescription("min duration in seconds")
    val minDuration = 0

    @JsonProperty("max_duration")
    @JsonPropertyDescription("max duration in seconds")
    val maxDuration = 0
}
