package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonTypeInfo
import javax.validation.constraints.NotNull
import org.springframework.data.annotation.PersistenceCreator;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
data class WorkObject @JsonCreator @PersistenceCreator constructor(
    @NotNull
    override val name: String,

    @NotNull
    val type: WorkObjectType,

    val List<ValueObject>: valueObjects,
) : DSTElement(name) {
    constructor(name: String) : this(name, WorkObjectType.MISC, listOf())
}

