package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import org.springframework.data.annotation.PersistenceCreator

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
class WorkObject @JsonCreator @PersistenceCreator constructor(
  name: String,

  val type: WorkObjectType,

  @JsonProperty("value_objects")
  val valueObjects: List<ValueObject> = listOf(),
) : DSTElement(name)

