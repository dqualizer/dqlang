package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.mongodb.core.mapping.Field

/**
 * former "Object" class. Now represents a code component.
 */
open class CodeComponent(
    @Field("componentName")
    open val name: String,
    @JsonProperty("operation_id")
    val identifier: String,
    val file: String,
    val type: String = "none",
    @JsonProperty("implements")
    val myimplements: Set<String> = emptySet(),
    val objects: Set<String> = emptySet(),
    val activities: Set<String> = emptySet()
) : ArchitectureEntity()
