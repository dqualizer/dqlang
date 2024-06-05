package io.github.dqualizer.dqlang.types.dam.domainstory

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import org.springframework.data.mongodb.core.mapping.Field

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
data class WorkObject(
  @Field("workObjectName")
  override val name: String,

  val type: WorkObjectType,

  @JsonProperty("value_objects")
  val valueObjects: List<ValueObject> = listOf(),
) : DSTElement(name)

