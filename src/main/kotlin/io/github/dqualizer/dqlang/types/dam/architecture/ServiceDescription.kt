package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.APISchema
import jakarta.annotation.Nullable
import lombok.Builder
import org.springframework.data.mongodb.core.mapping.Document
import java.net.URI

/**
 * Service Description
 *
 * A generic description of a service. E.g. a docker container, a web service, a database, ...
 *
 */

@Builder(toBuilder = true)
@Document
data class ServiceDescription(
    val name: String,

    @JsonProperty("deployment_name")
    @JsonPropertyDescription("Name under which the service is deployed. e.g. the name of the docker container. Can be empty then the name is used.")
    private val deploymentName: String? = null,

    @JsonPropertyDescription("Route to access the service. e.g. ssh address, ")
    val uri: URI,

    @JsonProperty("programming_framework")
    @JsonPropertyDescription("Framework used to run the service. Spring, ASP.NET Core, ...")
    val programmingFramework: ProgrammingFramework,

    @JsonPropertyDescription("Language used to run the service. Java, C#, ...")
    val programmingLanguage: String = "",

    @JsonProperty("instrumentation_framework")
    @JsonPropertyDescription("A generic description of an instrumentation framework. ")
    val instrumentationFramework: InstrumentationFramework,

    @JsonProperty("runtime_platform_id")
    @JsonPropertyDescription("The id of the runtime platform that the service is running on. May be empty if its run locally.")
    val runtimePlatformId: String,

    @JsonProperty("endpoints")
    @JsonPropertyDescription("The technical Endpoints that this service has.")
    val endpoints: Collection<RESTEndpoint>,

    @JsonPropertyDescription("The API Schema that this service provides.")
    val apiSchema: APISchema?,

    @JsonProperty("code_components")
    @JsonPropertyDescription("The components that this service provides. Legacy class to keep compatibilty to the first iteration of dqualizer.")
    val codeComponents: Collection<CodeComponent>

) : ArchitectureEntity() {
    fun getDeploymentName(): String {
        return deploymentName ?: name
    }


}
