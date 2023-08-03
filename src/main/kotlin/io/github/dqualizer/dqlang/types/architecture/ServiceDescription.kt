package io.github.dqualizer.dqlang.types.architecture

import com.fasterxml.jackson.annotation.*
import io.github.dqualizer.dqlang.types.instrumentation.Instrument
import io.github.dqualizer.dqlang.types.instrumentation.InstrumentationFrameworkDescription
import lombok.Builder
import javax.validation.constraints.NotNull

/**
 * Service Description
 *
 *
 * A generic description of a service.
 *
 */

@Builder(toBuilder = true)
data class ServiceDescription(
    val name: String,

    @JsonProperty("deployment_name")
    @JsonPropertyDescription("Name under which the service is deployed. e.g. the name of the docker container. Can be empty then the name is used.")
    val deploymentName: String,

    @JsonPropertyDescription("Route to access the service. e.g. via ssh")
    val uri: String,

    @JsonProperty("service_framework")
    @JsonPropertyDescription("Framework used to run the service.")
    val serviceFramework: String,

    @JsonProperty("instrumentation_framework")
    @JsonPropertyDescription("A generic description of an instrumentation framework. ")
    val instrumentationFramework: InstrumentationFrameworkDescription,


    val instruments: @NotNull MutableList<Instrument>? = ArrayList(),

    @JsonProperty("runtime_platform_id")
    @JsonPropertyDescription("The id of the runtime platform that the service is running on. May be empty if its run locally.")
    val runtimePlatformId: String = null
)
