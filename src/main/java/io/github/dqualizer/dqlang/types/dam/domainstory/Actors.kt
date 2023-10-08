package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes(
    JsonSubTypes.Type(value = Person::class, name = "Person"),
    JsonSubTypes.Type(value = System::class, name = "System"),
    JsonSubTypes.Type(value = Group::class, name = "Group")
)
sealed class Actor(actorName: String) : DSTEntity(actorName)

data class Person @JsonCreator constructor(val personName: String) : Actor(personName)

data class System @JsonCreator constructor(val systemName: String) : Actor(systemName)

data class Group @JsonCreator constructor(val groupName: String) : Actor(groupName)
