package dqualizer.dqlang.archive.k6adapter.dqlang.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class Stimulus {
    @JsonProperty("load_profile")
    private val loadProfile: String? = null

    @JsonProperty("highest_load")
    private val highestLoad: String? = null

    @JsonProperty("time_to_highest_load")
    private val timeToHighestLoad: String? = null

    @JsonProperty("type_of_increase")
    private val typeOfIncrease: String? = null

    @JsonProperty("base_load")
    private val baseLoad: String? = null
    private val accuracy = 0
}
