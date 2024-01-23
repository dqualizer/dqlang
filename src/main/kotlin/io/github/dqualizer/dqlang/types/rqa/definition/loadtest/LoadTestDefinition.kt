package io.github.dqualizer.dqlang.types.rqa.definition.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.dam.Identifiable
import io.github.dqualizer.dqlang.types.rqa.definition.enums.ResultMetrics
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.parametrization.Parametrization
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus
import org.springframework.data.mongodb.core.index.Indexed

data class LoadTestDefinition (
    @Indexed(unique = true)
    val name: String? = null,

    val artifact: Artifact? = null,

    val description: String? = null,

    val stimulus: Stimulus? = null,

    val parametrization: Parametrization? = null,

    @JsonProperty("response_measure")
    val responseMeasures: ResponseMeasures? = null,

    @JsonProperty("result_metrics")
    val resultMetrics: Set<ResultMetrics>? = null
): Identifiable()

