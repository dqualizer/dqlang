package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * former "Object" class. Now represents a code component.
 */
data class CodeComponent(
    val name: String,
    @JsonProperty("operation_id")
    val operationId: String,
    val type: String,
    @JsonProperty("implements")
    val myimplements: Set<String> = emptySet(),
    val objects: Set<String> = emptySet(),
    val activities: Set<String> = emptySet()
) : ArchitectureEntity()
