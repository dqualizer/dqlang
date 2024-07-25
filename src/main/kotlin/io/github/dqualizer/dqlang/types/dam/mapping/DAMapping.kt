package io.github.dqualizer.dqlang.types.dam.mapping

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import io.github.dqualizer.dqlang.types.dam.domainstory.DSTElement
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory
import java.util.*

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes(
  value = [JsonSubTypes.Type(
    value = ActivityToCallMapping::class,
    name = "ActivityToCallMapping"
  ), JsonSubTypes.Type(
    value = WorkObjectToTypeMapping::class,
    name = "WorkObjectToTypeMapping"
  ), JsonSubTypes.Type(value = ValueObjectToTypeMapping::class, name = "ValueObjectToTypeMapping"), JsonSubTypes.Type(
    value = ActorMapping::class,
    name = "ActorMapping"
  )]
)
open class DAMapping @JsonCreator constructor(
  @JsonProperty("dst_element_id")
  val dstElementId: String? = null,

  @JsonProperty("architecture_element_id")
  val architectureElementId: String? = null
) {

  fun getDSTEntity(domainStory: DomainStory): DSTElement {
    return domainStory.findElementById(dstElementId!!)
  }

  fun getArchitectureEntity(softwareSystem: SoftwareSystem): Optional<ArchitectureEntity> {
    return softwareSystem.findArchitectureEntity(architectureElementId!!)
  }
}
