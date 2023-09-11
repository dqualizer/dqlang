package io.github.dqualizer.dqlang.types.dam.mapping

import io.github.dqualizer.dqlang.messaging.QueueFactory
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import io.github.dqualizer.dqlang.types.dam.domainstory.DSTEntity
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory
import org.slf4j.LoggerFactory


/**
 * Mapper that can apply
 */
class DAMapper(
    private val DAMappings: Set<DAMapping<*, *>>,
    private val domainStory: DomainStory,
    private val softwareSystem: SoftwareSystem
) {

    private val logger = LoggerFactory.getLogger(QueueFactory::class.java)

    private val mappingCache: MutableMap<DSTEntity, ArchitectureEntity> = mutableMapOf()

    fun map(source: DSTEntity): ArchitectureEntity? {
        logger.debug("Trying to map {}", source)

        if (mappingCache.containsKey(source))
            return mappingCache[source]

        val resolved = DAMappings.firstOrNull { it.source.equals(source) }?.getDestination(domainStory, softwareSystem)

        if (resolved != null)
            mappingCache[source] = resolved

        logger.debug("Mapped {} to {}", source, resolved)

        return resolved
    }

    @JvmName("mapToType")
    fun <T : ArchitectureEntity> map(entity: DSTEntity): T? {
        val mapped = map(entity)

        return if (mapped != null) {
            mapped as T
        } else null
    }
}
