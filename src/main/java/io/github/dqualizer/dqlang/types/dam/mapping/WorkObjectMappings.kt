package io.github.dqualizer.dqlang.types.dam.mapping

import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.github.dqualizer.dqlang.types.dam.architecture.CodeComponent
import io.github.dqualizer.dqlang.types.dam.domainstory.ValueObject
import io.github.dqualizer.dqlang.types.dam.domainstory.WorkObject

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class WorkObjectToTypeMapping(workObject: WorkObject, codeComponent: CodeComponent) :
    DAMapping(workObject.id, codeComponent.id) {
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class ValueObjectToTypeMapping(workObject: ValueObject, codeComponent: CodeComponent) :
    DAMapping(workObject.id, codeComponent.id) {
}
