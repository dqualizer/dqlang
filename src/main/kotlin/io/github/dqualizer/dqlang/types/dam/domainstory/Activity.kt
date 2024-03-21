package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.PersistenceCreator

data class Activity @JsonCreator @PersistenceCreator constructor(
    override val name: String,

    val action: String,

    val number: Int,

    val initiators: Set<String>,

    val targets: Set<String>,

    @JsonProperty("work_objects")
    val workObjects: Set<String>
) : DSTElement(name) {

    init {
        if (number < 0) {
            throw IllegalArgumentException("Number of Activity must be positive")
        }
    }

    override fun toString(): String {
        return "Activity %s: %s %s %s to/for %s".format(
            id, initiators, action.takeIf { it.isNotBlank() } ?: "?", workObjects, targets
        )
    }
}
