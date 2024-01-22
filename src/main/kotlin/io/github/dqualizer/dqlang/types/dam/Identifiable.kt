package io.github.dqualizer.dqlang.types.dam

import org.springframework.data.annotation.Id

abstract class Identifiable {
    @Id
    val id: String? = null

    /**
     * Read the class information stored in Mongo
     */
    val _class: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o !is Identifiable) {
            return false
        }
        return if (id == null) {
            false
        } else id == o.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: System.identityHashCode(this)
    }
}

