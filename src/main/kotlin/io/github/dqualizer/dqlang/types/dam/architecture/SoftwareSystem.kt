package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Environment
import lombok.Builder
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

/**
 * SoftwareSystem
 *
 *
 * A generic description of a software system.
 *
 */

@Document
@Builder
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
     * The runtime platforms that the various parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.
     */
    @JsonProperty("runtime_platforms")
    @JsonPropertyDescription("The runtime platforms that the valious parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.")
    val runtimePlatforms: List<RuntimePlatform> = ArrayList()
) : ArchitectureEntity() {
    fun findEntityById(architectureElementId: String): ArchitectureEntity {
        if (this.id == architectureElementId)
            return this

        return (services.find { it.id == architectureElementId }
            ?: services.flatMap { it.codeComponents }
                .union(services.flatMap { it.endpoints })
                .find { it.id == architectureElementId })
            ?: throw NoSuchElementException("No element with id $architectureElementId found")

    }
}
