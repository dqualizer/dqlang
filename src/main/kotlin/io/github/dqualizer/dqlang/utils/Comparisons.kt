package io.github.dqualizer.dqlang.utils

object Comparisons {
  fun setsEqual(a: Set<*>?, b: Set<*>?): Boolean {
    if (a === b) {
      return true
    }
    if (a == null || b == null) {
      return false
    }
    return if (a.size != b.size) {
      false
    } else a.containsAll(b)
  }
}
