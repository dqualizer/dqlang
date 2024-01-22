package io.github.dqualizer.dqlang.types.dam.mapping

import com.fasterxml.jackson.annotation.JsonTypeInfo
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity
import io.github.dqualizer.dqlang.types.dam.architecture.ServiceDescription
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor
import io.github.dqualizer.dqlang.types.dam.domainstory.System


sealed class ActorMapping : DAMapping {
    constructor(dstElementId: Actor, architectureElement: ArchitectureEntity) : super(
        dstElementId.id!!,
        architectureElement.id!!
    )
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class SystemToComponentMapping(dstElementId: System, serviceDescription: ServiceDescription) :
    ActorMapping(dstElementId, serviceDescription) {
}

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class UserToBehaviourMapping(dstElementId: Actor, architectureElementId: ArchitectureEntity) :
    ActorMapping(dstElementId, architectureElementId) {
    init {
        throw NotImplementedError()
    }
}
