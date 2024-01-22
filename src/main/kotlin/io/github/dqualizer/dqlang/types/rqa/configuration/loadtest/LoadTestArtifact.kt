package io.github.dqualizer.dqlang.types.rqa.configuration.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.dam.architecture.RESTEndpoint
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.Artifact
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.ResponseMeasures
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus

data class LoadTestArtifact (
    val artifact: Artifact? = null,

    val description: String? = null,

    val stimulus: Stimulus? = null,

    @JsonProperty("response_measure")
    val responseMeasure: ResponseMeasures? = null,

    val httpEndpoint: RESTEndpoint? = null
)
