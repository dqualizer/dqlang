package io.github.dqualizer.dqlang.types.dam.domainstory

import io.github.dqualizer.dqlang.types.dam.Identifiable

abstract class DSTElement(open val name: String) : Identifiable() {

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is DSTElement) return false

    return (id != null && id == other.id) || (id == null && other.id == null && name == other.name)
  }

  override fun hashCode(): Int {
    var result = id.hashCode()
    if (id == null)
      result = 31 * result + name.hashCode()
    return result
  }
}
