package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic

import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName(SymbolicDoubleValue.TYPE_IDENTIFIER)
data class SymbolicDoubleValue(
    override val name: String,

    val value: Double? = null
) : SymbolicValue() {
    companion object {
        const val TYPE_IDENTIFIER: String = "double"
    }
}
