package io.github.dqualizer.dqlang.types.rqa.definition

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.dam.Identifiable
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Environment
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.NotNull

@Document
data class RuntimeQualityAnalysisDefinition @JsonCreator constructor(
  @Indexed(unique = true)
  val name: String,

  val version: String,

  @JsonProperty("domain_id")
  @NotNull
  val domainId: String,
  
  @NotNull
  val context: String,

  val environment: Environment,

  @JsonProperty("runtime_quality_analysis")
  val runtimeQualityAnalysis: RuntimeQualityAnalysis
) : Identifiable()

