package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic.SymbolicValue

data class LoadIncrease(
    @JsonProperty("base_load")
    override val baseLoad: SymbolicValue? = null,

    @JsonProperty("highest_load")
    val highestLoad: SymbolicValue? = null,

    @JsonProperty("time_to_highest_load")
    val timeToHighestLoad: SymbolicValue? = null,

    @JsonProperty("constant_duration")
    val constantDuration: SymbolicValue? = null
) : LoadProfile() {
    companion object {
        const val TYPE_IDENTIFIER: String = "increase"
    }
}
