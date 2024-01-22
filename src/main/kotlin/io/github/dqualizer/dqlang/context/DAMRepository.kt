package io.github.dqualizer.dqlang.context

import io.github.dqualizer.dqlang.types.dam.DomainArchitectureMapping
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
abstract class DAMRepository : MongoRepository<DomainArchitectureMapping, String>
