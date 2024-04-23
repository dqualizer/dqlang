package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.http.HttpMethod
import java.util.*
import kotlin.collections.HashSet

class RESTEndpoint @JsonCreator constructor(
    override val name: String,
    // reference to a code component, for example a method
    val component: String,
    val route: String,
    val parameter: Set<EndpointParameter> = HashSet(),
    val methods: Set<HttpMethod> = HashSet(),
    @JsonProperty("response_description")
    val responseDescription: ResponseDescription? = null
) : CodeComponent(name, name, "REST Endpoint") {
    enum class EndpointParameterType {
        PathVariable,
        QueryParameter,
        RequestBody,
        Header
    }

    data class EndpointParameter(
        val type: EndpointParameterType? = null,
        val data: String? = null
    ) {
        fun checkFormat(input: String?): Boolean {
            val regex = Regex(data!!)
            return regex.matches(input!!)
        }
    }

    fun getParameterOfType(type: EndpointParameterType): Set<EndpointParameter> {
        return parameter.filter { type == it.type }.toHashSet()
    }
}
