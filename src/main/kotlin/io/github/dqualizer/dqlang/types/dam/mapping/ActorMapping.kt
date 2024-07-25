package io.github.dqualizer.dqlang.types.dam.mapping

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity
import io.github.dqualizer.dqlang.types.dam.architecture.ServiceDescription
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor
import io.github.dqualizer.dqlang.types.dam.domainstory.System
import org.springframework.data.annotation.PersistenceCreator


sealed class ActorMapping : DAMapping {
  constructor(dstElement: Actor, architectureElement: ArchitectureEntity) :
    super(
      dstElement.id,
      architectureElement.id
    )

  constructor(dstElementId: String, architectureElementId: String) :
    super(
      dstElementId,
      architectureElementId
    )
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class SystemToComponentMapping :
  ActorMapping {
  constructor(dstElementId: System, serviceDescription: ServiceDescription) : super(
    dstElementId,
    serviceDescription
  )

  @JsonCreator
  @PersistenceCreator
  constructor(
    @JsonProperty("dst_element_id")
    dstElementId: String,
    @JsonProperty("architecture_element_id")
    architectureElementId: String
  ) : super(dstElementId, architectureElementId)
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class UserToBehaviourMapping :
  ActorMapping {
  constructor(dstElement: Actor, architectureElement: ArchitectureEntity) : super(
    dstElement,
    architectureElement
  ) {
    throw NotImplementedError("This type of mapping is not yet supported.")
  }

  @JsonCreator
  @PersistenceCreator
  constructor(
    @JsonProperty("dst_element_id")
    dstElementId: String,
    @JsonProperty("architecture_element_id")
    architectureElementId: String
  ) : super(dstElementId, architectureElementId)
}
