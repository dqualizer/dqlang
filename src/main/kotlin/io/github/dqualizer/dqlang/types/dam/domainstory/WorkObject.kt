package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import org.springframework.data.annotation.PersistenceCreator
import javax.validation.constraints.NotNull

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
data class WorkObject @JsonCreator @PersistenceCreator constructor(
    @NotNull
    override val name: String,

    @NotNull
    val type: WorkObjectType,

    @JsonProperty("value_objects")
    val valueObjects: List<ValueObject> = listOf(),
) : DSTElement(name) {
    constructor(name: String) : this(name, WorkObjectType.MISC)
}

