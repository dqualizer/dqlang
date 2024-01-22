package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic.SymbolicValue

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
    JsonSubTypes.Type(name = LoadIncrease.TYPE_IDENTIFIER, value = LoadIncrease::class),
    JsonSubTypes.Type(name = LoadPeak.TYPE_IDENTIFIER, value = LoadPeak::class),
    JsonSubTypes.Type(name = ConstantLoad.TYPE_IDENTIFIER, value = ConstantLoad::class)
)
sealed class LoadProfile {
    abstract val baseLoad: SymbolicValue?
}
