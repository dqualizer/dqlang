package dqualizer.dqlang.archive.k6configurationrunner.dqlang.request

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Checks {
    @JsonProperty("status_codes")
    private val statusCodes: LinkedHashSet<Int>? = null

    @JsonProperty("duration")
    private val duration = 0
}
