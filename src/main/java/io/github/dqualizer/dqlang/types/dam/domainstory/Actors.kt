package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator

sealed class Actor(actorName: String) : DSTEntity(actorName)

data class Person @JsonCreator constructor(val personName: String) : Actor(personName)

data class System @JsonCreator constructor(val systemName: String) : Actor(systemName)

data class Group @JsonCreator constructor(val groupName: String) : Actor(groupName)
