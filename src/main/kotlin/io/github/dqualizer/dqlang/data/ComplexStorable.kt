package io.github.dqualizer.dqlang.data

interface ComplexStorable<T> {
  /**
   * This method is used during the save process of the Domain Architecture Mapping.
   *
   * The implementation of this method should
   * 1. Save all @DocumentReferences to the appropriate database
   *      - trigger `store` if necessary
   * 2. Save the object itself to the appropriate database
   * 3. Update the id of the object if it was not set before with the save result
   * 4. return this
   *
   */
  fun store(repositories: DqualizerRepositories): T
}
