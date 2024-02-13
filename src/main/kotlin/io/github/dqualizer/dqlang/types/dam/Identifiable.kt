package io.github.dqualizer.dqlang.types.dam

import org.springframework.data.annotation.Id

abstract class Identifiable {
    @Id
    var id: String? = null

    /**
     * Read the class information stored in Mongo
     */
    val _class: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is Identifiable) {
            return false
        }
        return if (id == null) {
            false
        } else id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: System.identityHashCode(this)
    }
}

