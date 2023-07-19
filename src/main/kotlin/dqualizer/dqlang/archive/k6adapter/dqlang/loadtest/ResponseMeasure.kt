package dqualizer.dqlang.archive.k6adapter.dqlang.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ResponseMeasure {
    @JsonProperty("response_time")
    private val responseTime: String? = null
}
