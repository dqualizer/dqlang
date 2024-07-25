package io.github.dqualizer.dqlang.types.rqa.definition.resilience

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.stimulus.ResilienceStimulus
import org.springframework.data.mongodb.core.index.Indexed

data class ResilienceTestDefinition(
  @Indexed(unique = true)
  val name: String,
  val artifact: Artifact,
  val description: String,
  val stimulus: ResilienceStimulus,
  @field:JsonProperty("response_measure")
  val responseMeasures: ResilienceResponseMeasures,
)

