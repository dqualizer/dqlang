package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
    JsonSubTypes.Type(name = SymbolicIntValue.TYPE_IDENTIFIER, value = SymbolicIntValue::class),
    JsonSubTypes.Type(name = SymbolicDoubleValue.TYPE_IDENTIFIER, value = SymbolicDoubleValue::class)
)
sealed class SymbolicValue {
    abstract val name: String
}
