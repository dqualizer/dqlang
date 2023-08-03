package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class Stimulus {
    @JsonProperty("load_profile")
    val loadProfile: String? = null

    @JsonProperty("highest_load")
    val highestLoad: String? = null

    @JsonProperty("time_to_highest_load")
    val timeToHighestLoad: String? = null

    @JsonProperty("type_of_increase")
    val typeOfIncrease: String? = null

    @JsonProperty("base_load")
    val baseLoad: String? = null
    val accuracy = 0
}
