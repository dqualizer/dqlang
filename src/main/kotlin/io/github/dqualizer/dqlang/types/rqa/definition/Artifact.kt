package io.github.dqualizer.dqlang.types.rqa.definition

import com.fasterxml.jackson.annotation.JsonProperty

data class Artifact(
  @JsonProperty("system_id")
  val systemId: String? = null,

  @JsonProperty("activity_id")
  val activityId: String? = null
) {
  fun isNode(): Boolean = systemId != null

  fun isEdge(): Boolean = systemId == null
}
