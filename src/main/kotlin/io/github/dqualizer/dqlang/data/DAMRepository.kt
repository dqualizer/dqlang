package io.github.dqualizer.dqlang.data

import io.github.dqualizer.dqlang.exceptions.ContextNotFoundException
import io.github.dqualizer.dqlang.types.dam.DomainArchitectureMapping
import org.springframework.stereotype.Repository


@Repository
class DAMRepository(
  private val dqualizerRepositories: DqualizerRepositories
) {

  private val damRepository = dqualizerRepositories.damRepository

  fun getDAMByID(id: String): DomainArchitectureMapping {
    return dqualizerRepositories.damRepository
      .findById(id)
      .orElseThrow { ContextNotFoundException(id) }
  }

  fun storeDAM(dam: DomainArchitectureMapping): DomainArchitectureMapping {
    return dam.store(dqualizerRepositories);
  }

  fun contains(contextID: String): Boolean {
    return damRepository.existsById(contextID)
  }

  fun clear() {
    damRepository.deleteAll()
  }

  fun removeDAM(id: String) {
    damRepository.deleteById(id)
  }
}
