package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * former "Object" class. Now represents a code component.
 */
open class CodeComponent(
  open val name: String,

  @JsonProperty("identifier")
  @JsonAlias("operation_id")
  val identifier: String,

  val file: String,

  val type: String = "none",

  @JsonProperty("implements")
  val myimplements: Set<String> = emptySet(),
  val objects: Set<String> = emptySet(),
  val activities: Set<String> = emptySet()
) : ArchitectureEntity()
