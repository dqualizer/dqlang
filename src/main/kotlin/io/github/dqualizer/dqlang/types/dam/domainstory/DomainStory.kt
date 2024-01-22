package io.github.dqualizer.dqlang.types.dam.domainstory

import io.github.dqualizer.dqlang.types.dam.Identifiable
import lombok.Builder
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

/**
 * @author Lion Wagner
 */
@Document
@Builder
data class DomainStory(
    val actors: List<Actor>,
    val workObjects: List<WorkObject>,
    val activities: List<Activity>
) : Identifiable(){

    fun findElementById(id: String): DSTElement {
        return actors.find { it.id == id }
            ?: workObjects.find { it.id == id }
            ?: activities.find { it.id == id }
            ?: throw IllegalArgumentException("No element with id $id found")
    }
}
