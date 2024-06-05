package io.github.dqualizer.dqlang.types.dam

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.data.ComplexStorable
import io.github.dqualizer.dqlang.data.DqualizerRepositories
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory
import io.github.dqualizer.dqlang.types.dam.mapping.DAMapper
import io.github.dqualizer.dqlang.types.dam.mapping.DAMapping
import org.springframework.data.annotation.PersistenceCreator
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference


@Document
class DomainArchitectureMapping
@PersistenceCreator @JsonCreator constructor(
  /**
   * technical system description
   */
  @field:DocumentReference @param:JsonProperty("software_system") val softwareSystem: SoftwareSystem,
  @field:DocumentReference @param:JsonProperty("domain_story") val domainStory: DomainStory,
  @field:JsonProperty("mappings") @param:JsonProperty(
    "mappings"
  ) val daMappings: Set<DAMapping>
) : Identifiable(), ComplexStorable<DomainArchitectureMapping?> {
  constructor(softwareSystem: SoftwareSystem, domainStory: DomainStory) : this(
    softwareSystem,
    domainStory,
    HashSet<DAMapping>()
  )


  @get:JsonIgnore
  val mapper: DAMapper
    get() = DAMapper(this, false)

  @JsonIgnore
  fun getMapper(lazy: Boolean): DAMapper {
    return DAMapper(this, lazy)
  }

  override fun store(repositories: DqualizerRepositories): DomainArchitectureMapping {
    softwareSystem.store(repositories)
    domainStory.store(repositories)

    val saved = repositories.damRepository.save(this)
    this.id = saved.id

    return this
  }
}
