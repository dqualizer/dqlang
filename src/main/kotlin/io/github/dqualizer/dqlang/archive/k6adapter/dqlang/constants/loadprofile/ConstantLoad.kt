package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ConstantLoad {
    private val low = 0
    private val medium = 0
    private val high = 0

    @JsonProperty("min_duration")
    @JsonPropertyDescription("min duration in seconds")
    private val minDuration = 0

    @JsonProperty("max_duration")
    @JsonPropertyDescription("max duration in seconds")
    private val maxDuration = 0
}
