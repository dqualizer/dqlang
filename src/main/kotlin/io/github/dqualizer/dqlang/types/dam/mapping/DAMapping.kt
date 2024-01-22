package io.github.dqualizer.dqlang.types.dam.mapping

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import io.github.dqualizer.dqlang.types.dam.domainstory.DSTElement
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory

data class DAMapping @JsonCreator constructor(
    @JsonProperty("dst_element_id")
    val dstElementId: String,

    @JsonProperty("architecture_element_id")
    val architectureElementId: String
) {

    fun getDSTEntity(domainStory: DomainStory): DSTElement {
        return domainStory.findElementById(dstElementId)
    }

    fun getArchitectureEntity(softwareSystem: SoftwareSystem): ArchitectureEntity {
        return softwareSystem.findEntityById(architectureElementId)
    }
}

