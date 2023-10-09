package io.github.dqualizer.dqlang.types.dam.domainstory

import io.github.dqualizer.dqlang.types.dam.Identifiable
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

/**
 * @author Lion Wagner
 */
@Document
data class DomainStory(

    @DocumentReference
    val actors: List<Actor>,

    @DocumentReference
    val workObjects: List<WorkObject>,

    @DocumentReference
    val activities: List<Activity>
) : Identifiable(){

    fun findEntityById(id: String): DSTEntity {
        return actors.find { it.id == id }
            ?: workObjects.find { it.id == id }
            ?: activities.find { it.id == id }
            ?: throw IllegalArgumentException("No element with id $id found")
    }
}
