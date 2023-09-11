package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.*
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Environment
import org.springframework.data.mongodb.core.mapping.DocumentReference

/**
 * SoftwareSystem
 *
 *
 * A generic description of a software system.
 *
 */

data class SoftwareSystem(
    /**
     * The name of the software system.
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the software system.")
    val name: String,

    val environment: Environment,

    /**
     * The services that the software system provides.
     */
    @JsonProperty("services")
    @JsonPropertyDescription("The services that the software system provides.")
    @DocumentReference
    val services: List<ServiceDescription> = ArrayList(),

    /**
     * The runtime platforms that the valious parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.
     */
    @JsonProperty("runtime_platforms")
    @JsonPropertyDescription("The runtime platforms that the valious parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.")
    val runtimePlatforms: List<RuntimePlatform> = ArrayList()
) : ArchitectureEntity()
