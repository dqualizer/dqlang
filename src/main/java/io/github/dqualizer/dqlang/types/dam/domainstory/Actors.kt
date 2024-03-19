package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import org.springframework.data.mongodb.core.mapping.Field

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes(
    JsonSubTypes.Type(value = Person::class, name = "Person"),
    JsonSubTypes.Type(value = System::class, name = "System"),
    JsonSubTypes.Type(value = Group::class, name = "Group")
)

sealed class Actor(name: String) : DSTElement(name)

class Person(name: String) : Actor(name)

class System(name: String) : Actor(name)

class Group(name: String) : Actor(name)
