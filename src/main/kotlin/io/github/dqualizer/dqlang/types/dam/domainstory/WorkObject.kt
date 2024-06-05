package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
data class WorkObject(
  override val name: String,

  val type: WorkObjectType,

  @JsonProperty("value_objects")
  val valueObjects: List<ValueObject> = listOf(),
) : DSTElement(name)

