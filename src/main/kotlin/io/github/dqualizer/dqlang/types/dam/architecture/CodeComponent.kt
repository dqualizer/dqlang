package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * former "Object" class. Now represents a code component.
 */
data class CodeComponent(
    private val name: String,
    @JsonProperty("operation_id")
    private val operationId: String,
    private val type: String,
    @JsonProperty("implements")
    private val myimplements: Set<String> = emptySet(),
    private val objects: Set<String> = emptySet(),
    private val activities: Set<String> = emptySet()
) : ArchitectureEntity()
