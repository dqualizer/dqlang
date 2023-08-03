package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ResponseMeasure {
    @JsonProperty("response_time")
    val responseTime: String? = null
}
