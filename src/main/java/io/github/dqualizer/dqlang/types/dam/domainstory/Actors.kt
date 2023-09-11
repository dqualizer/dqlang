package io.github.dqualizer.dqlang.types.dam.domainstory

import org.springframework.data.mongodb.core.mapping.Document

sealed class Actor(actorName: String) : DSTEntity(actorName)

data class Person(private val personName: String) : Actor(personName)

data class System(private val systemName: String) : Actor(systemName)

data class Group(private val groupName: String) : Actor(groupName)
