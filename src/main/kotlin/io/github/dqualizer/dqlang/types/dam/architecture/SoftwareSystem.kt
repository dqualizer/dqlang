package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import io.github.dqualizer.dqlang.data.ComplexStorable
import io.github.dqualizer.dqlang.data.DqualizerRepositories
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Environment
import lombok.Builder
import org.springframework.data.annotation.Transient
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference
import java.util.*

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
    var services: List<ServiceDescription> = ArrayList(),


    /**
     * The runtime platforms that the various parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.
     */
    @JsonProperty("runtime_platforms")
    @JsonPropertyDescription("The runtime platforms that the valious parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.")
    val runtimePlatforms: List<RuntimePlatform> = ArrayList()
) : ArchitectureEntity(), ComplexStorable<SoftwareSystem> {


    @Transient
    val codeComponents: Set<CodeComponent> =
        services.flatMap { it.codeComponents }.union(services.flatMap { it.endpoints })


    @Transient
    val architectureEntities: List<ArchitectureEntity> = services +  codeComponents


    inline fun <reified T : ArchitectureEntity> findArchitectureEntityOfType(architectureElementId: String): Optional<T> {
        val entity = this.findArchitectureEntity(architectureElementId)

        if (!entity.isPresent) {
            return Optional.empty()
        }

        return if (entity.get() is T) {
            Optional.of(entity.get() as T)
        } else {
            throw NoSuchElementException("Entity with id $architectureElementId is not of type ${T::class} but of type ${entity.get().javaClass}")
        }

    }

    fun findArchitectureEntity(architectureElementId: String): Optional<ArchitectureEntity> {
        if (this.id == architectureElementId)
            return Optional.of(this)

        return Optional.ofNullable(
            architectureEntities.find { it.id == architectureElementId }
        )

    }

    fun findServiceByName(serviceName: String): Optional<ServiceDescription> {
        return Optional.ofNullable(services.find { it.name == serviceName })
    }

    fun findRuntimePlatformById(platformId: String): Optional<RuntimePlatform> {
        return Optional.ofNullable(runtimePlatforms.find { it.platformId == platformId })
    }

    override fun store(repositories: DqualizerRepositories): SoftwareSystem {

        services
            .map { Pair(it, repositories.servicesRepository.save(it)) }
            .forEach { (old, new) -> old.id = new.id }

        val saved = repositories.softwareSystemRepository.save(this)
        this.id = saved.id
        return this
    }
}
