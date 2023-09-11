package io.github.dqualizer.dqlang.types.dam.domainstory

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.DocumentReference

/**
 * @author Lion Wagner
 */
@Document
data class DomainStory(

    @Id
    val id: String? = null,

    @DocumentReference
    val actors: List<Actor>,

    @DocumentReference
    val workObjects: List<WorkObject>,

    @DocumentReference
    val activities: List<Activity>
)
