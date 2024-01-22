package io.github.dqualizer.dqlang.types.dam.mapping

import io.github.dqualizer.dqlang.messaging.QueueFactory
import io.github.dqualizer.dqlang.types.dam.DomainArchitectureMapping
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity
import io.github.dqualizer.dqlang.types.dam.domainstory.DSTElement
import org.slf4j.LoggerFactory

/**
 * Mapper that can apply
 *
 * @param lazy if true, the mapper will only map elements when they are requested otherwise it will build a cache upon creation
 */

class DAMapper @JvmOverloads constructor(
    private val domainArchitectureMapping: DomainArchitectureMapping,
    private val lazy: Boolean = false
) {

    private val logger = LoggerFactory.getLogger(QueueFactory::class.java)

    private val mappingCache = mutableMapOf<String, ArchitectureEntity>()
    private val backMappingCache = mutableMapOf<String, DSTElement>()

    private val mappings: Set<DAMapping> = domainArchitectureMapping.daMappings

    init {
        this.mappings.forEach { mapping ->
            logger.debug("Mapping ${mapping.dstElementId} to ${mapping.architectureElementId}")
            mappingCache[mapping.dstElementId] =
                mapping.getArchitectureEntity(domainArchitectureMapping.softwareSystem)
            backMappingCache[mapping.architectureElementId] =
                mapping.getDSTEntity(domainArchitectureMapping.domainStory)
        }
    }

    fun getMappings(dstElement: DSTElement): Set<DAMapping> {
        val id = dstElement.id!!
        return getMappings(id)
    }

    fun getMappings(elementId: String): Set<DAMapping> {
        return mappings.filter { it.dstElementId == elementId || it.architectureElementId == elementId }.toSet()
    }

    fun getMappings(architectureEntity: ArchitectureEntity): Set<DAMapping> {
        return mappings.filter { it.architectureElementId == architectureEntity.id }.toSet()
    }

    fun mapToArchitecturalEntity(dstElement: DSTElement): ArchitectureEntity {
        val id = dstElement.id!!
        return mapToArchitecturalEntity(id)
    }

    fun mapToArchitecturalEntity(dstElementId: String): ArchitectureEntity {
        return mappingCache.computeIfAbsent(dstElementId) {
            val mapping = mappings.find { it.dstElementId == dstElementId }
                ?: throw NoSuchElementException("No mapping for DST element $dstElementId found.")

            mapping.getArchitectureEntity(domainArchitectureMapping.softwareSystem)
        }
    }

    fun mapToDSTEntity(architectureElementId: String): DSTElement {
        return backMappingCache.computeIfAbsent(architectureElementId) {
            val mapping = mappings.find { it.architectureElementId == architectureElementId }
                ?: throw NoSuchElementException("No mapping for architecture element $architectureElementId found.")

            mapping.getDSTEntity(domainArchitectureMapping.domainStory)
        }
    }
}
