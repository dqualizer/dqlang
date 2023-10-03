package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.*
import lombok.Builder
import java.net.URI

/**
 * Service Description
 *
 * A generic description of a service. E.g. a docker container, a web service, a database, ...
 *
 */

@Builder(toBuilder = true)
data class ServiceDescription(
    val name: String,

    @JsonProperty("deployment_name")
    @JsonPropertyDescription("Name under which the service is deployed. e.g. the name of the docker container. Can be empty then the name is used.")
    private val deploymentName: String? = null,

    @JsonPropertyDescription("Route to access the service. e.g. ssh address, ")
    val uri: URI,

    @JsonProperty("service_framework")
    @JsonPropertyDescription("Framework used to run the service. Spring, ASP.NET Core, ...")
    val programmingFramework: ProgrammingFramework,

    @JsonProperty("instrumentation_framework")
    @JsonPropertyDescription("A generic description of an instrumentation framework. ")
    val instrumentationFramework: InstrumentationFramework,

    @JsonProperty("runtime_platform_id")
    @JsonPropertyDescription("The id of the runtime platform that the service is running on. May be empty if its run locally.")
    val runtimePlatformId: String,

    @JsonProperty("endpoints")
    @JsonPropertyDescription("The technical Endpoints that this service has.")
    val endpoints: Collection<RESTEndpoint>,


    @JsonProperty("controllers")
    @JsonPropertyDescription("The controllers that this service provides. Legacy class to keep compatibilty to the first iteration of dqualizer.")
    val controllers: Collection<CodeComponent>

) : ArchitectureEntity() {
    fun getDeploymentName(): String {
        return deploymentName ?: name
    }
}
