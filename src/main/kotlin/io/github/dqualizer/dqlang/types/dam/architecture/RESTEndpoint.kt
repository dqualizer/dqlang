package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.http.HttpMethod
import java.util.*


data class RESTEndpoint @JsonCreator constructor(
    override var name: String,
    val route: String,
    val components: Map<EndpointComponentType, Set<EndpointComponent>> = EnumMap(EndpointComponentType::class.java),
    val methods: Set<HttpMethod> = HashSet(),
    @JsonProperty("response_description")
    val responseDescription: ResponseDescription? = null
) : CodeComponent(name,name, "REST Endpoint") {
    enum class EndpointComponentType {
        PathVariable,
        QueryParameter,
        RequestBody,
        Header
    }

    data class EndpointComponent(
        val type: EndpointComponentType? = null,
        val format: String? = null
    ) {
        fun checkFormat(input: String?): Boolean {
            val regex = Regex(format!!)
            return regex.matches(input!!)
        }
    }


    fun getComponentsOfType(type: EndpointComponentType?): Set<EndpointComponent> {
        return components.getOrDefault(type, emptySet())
    }
}
