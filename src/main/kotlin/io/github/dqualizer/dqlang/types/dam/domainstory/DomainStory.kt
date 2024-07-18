package io.github.dqualizer.dqlang.types.dam.domainstory

import io.github.dqualizer.dqlang.data.ComplexStorable
import io.github.dqualizer.dqlang.data.DqualizerRepositories
import io.github.dqualizer.dqlang.types.dam.Identifiable
import org.springframework.data.annotation.Transient
import org.springframework.data.mongodb.core.mapping.Document
import java.util.function.Predicate

/**
 * @author Lion Wagner
 */
@Document
data class DomainStory(
  val actors: List<Actor>,
  val workObjects: List<WorkObject>,
  val activities: List<Activity>
) : Identifiable(), ComplexStorable<DomainStory> {

  @Transient
  private val valueObjects: List<ValueObject> =
    workObjects.flatMap { it.valueObjects }

  fun findElementById(id: String): DSTElement =
    find { element: DSTElement -> element.id == id }

  fun findElementByName(name: String): DSTElement =
    find { element: DSTElement -> element.name == name }

  private fun find(predicate: Predicate<DSTElement>) = (
    actors.find { predicate.test(it) }
      ?: workObjects.find { predicate.test(it) }
      ?: activities.find { predicate.test(it) }
      ?: valueObjects.find { predicate.test(it) }
      ?: throw IllegalArgumentException("No domain story element with id $id was found!"))


  override fun store(repositories: DqualizerRepositories): DomainStory {
    val saved = repositories.domainStoryRepository.save(this)
    this.id = saved.id
    return this
  }
}
