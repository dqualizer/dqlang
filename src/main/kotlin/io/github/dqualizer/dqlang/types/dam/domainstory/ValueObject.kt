package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonTypeInfo
import org.springframework.data.annotation.PersistenceCreator;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class ValueObject @JsonCreator @PersistenceCreator constructor(
    name: String
) : DSTElement(name)

