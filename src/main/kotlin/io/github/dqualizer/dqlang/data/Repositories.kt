package io.github.dqualizer.dqlang.data

import io.github.dqualizer.dqlang.types.dam.DomainArchitectureMapping
import io.github.dqualizer.dqlang.types.dam.architecture.ServiceDescription
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository


@Component
data class DqualizerRepositories(
    val damRepository: DAMMongoRepository,
    val softwareSystemRepository: SoftwareSystemMongoRepository,
    val domainStoryRepository: DomainStoryMongoRepository,
    val servicesRepository: ServicesMongoRepository
)

@Repository
interface DAMMongoRepository : MongoRepository<DomainArchitectureMapping, String>

@Repository
interface SoftwareSystemMongoRepository : MongoRepository<SoftwareSystem, String>

@Repository
interface DomainStoryMongoRepository : MongoRepository<DomainStory, String>

@Repository
interface ServicesMongoRepository : MongoRepository<ServiceDescription, String>

