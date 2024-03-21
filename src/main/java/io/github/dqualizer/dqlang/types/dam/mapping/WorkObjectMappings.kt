package io.github.dqualizer.dqlang.types.dam.mapping

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.github.dqualizer.dqlang.types.dam.architecture.CodeComponent
import io.github.dqualizer.dqlang.types.dam.domainstory.ValueObject
import io.github.dqualizer.dqlang.types.dam.domainstory.WorkObject
import org.springframework.data.annotation.PersistenceCreator

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class WorkObjectToTypeMapping :
    DAMapping {
    constructor(workObject: WorkObject, codeComponent: CodeComponent) : super(workObject.id, codeComponent.id)

    @JsonCreator
    @PersistenceCreator
    constructor(
        @JsonProperty("work_object_id")
        dstElementId: String,
        @JsonProperty("code_component_id")
        architectureElementId: String
    ) : super(dstElementId, architectureElementId)
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class ValueObjectToTypeMapping :
    DAMapping {
    constructor(valueObject: ValueObject, codeComponent: CodeComponent) : super(valueObject.id, codeComponent.id)

    @JsonCreator
    @PersistenceCreator
    constructor(
        @JsonProperty("value_object_id")
        dstElementId: String,
        @JsonProperty("code_component_id")
        architectureElementId: String
    ) : super(dstElementId, architectureElementId)
}


