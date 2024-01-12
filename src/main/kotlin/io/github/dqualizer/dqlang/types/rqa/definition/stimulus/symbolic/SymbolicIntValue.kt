package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic

import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName(SymbolicIntValue.TYPE_IDENTIFIER)
data class SymbolicIntValue(
    override val name: String,

    val value: Int? = null
) : SymbolicValue() {
    companion object {
        const val TYPE_IDENTIFIER: String = "integer"
    }
}
