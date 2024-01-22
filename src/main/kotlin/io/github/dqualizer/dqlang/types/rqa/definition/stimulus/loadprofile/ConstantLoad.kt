package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic.SymbolicValue

data class ConstantLoad(
    @JsonProperty("base_load")
    override val baseLoad: SymbolicValue? = null,

    @JsonProperty("target_load")
    val targetLoad: SymbolicValue? = null,

    val duration: SymbolicValue? = null
) : LoadProfile() {
    companion object {
        const val TYPE_IDENTIFIER: String = "constant"
    }
}
