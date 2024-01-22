package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonTypeInfo
import javax.validation.constraints.NotNull

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
data class WorkObject @JsonCreator constructor(
    @NotNull
    override val name: String,

    @NotNull
    val type: WorkObjectType
) : DSTElement(name) {
    constructor(name: String) : this(name, WorkObjectType.MISC)
}

