package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic.SymbolicValue

data class LoadPeak(
    @JsonProperty("base_load")
    override val baseLoad: SymbolicValue? = null,

    @JsonProperty("peak_load")
    val peakLoad: SymbolicValue? = null,

    val duration: SymbolicValue? = null
) : LoadProfile() {
    companion object {
        const val TYPE_IDENTIFIER: String = "peak"
    }
}
