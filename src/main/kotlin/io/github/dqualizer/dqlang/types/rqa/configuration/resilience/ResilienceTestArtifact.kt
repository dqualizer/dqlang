package io.github.dqualizer.dqlang.types.rqa.configuration.resilience

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.ResilienceResponseMeasures
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.stimulus.ResilienceStimulus

data class ResilienceTestArtifact(
  val name: String,

  val description: String? = null,

  @JsonProperty("process_artifact")
  val processArtifact: ProcessArtifact? = null,

  @JsonProperty("cmsb_artifact")
  val cmsbArtifact: CmsbArtifact? = null,

  val stimulus: ResilienceStimulus? = null,

  @JsonProperty("response_measure")
  val responseMeasure: ResilienceResponseMeasures? = null
)
