package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class RESTEndpoint @JsonCreator constructor(
  val name: String,
  // reference to a code component, for example a method
  @JsonProperty("code_component")
  val codeComponent: String,
  val route: String,
  val parameter: Set<EndpointParameter> = HashSet(),
  val methods: Set<EndpointMethod> = HashSet(),
  @JsonProperty("response_description")
  val responseDescription: ResponseDescription? = null
) {
  enum class EndpointParameterType {
    PathVariable,
    QueryParameter,
    RequestBody,
    Header
  }

  /**
   * We use our own enum since the Spring HttpMethod is not working with RabbitMQ serialization
   */
  enum class EndpointMethod {
    GET,
    HEAD,
    POST,
    PUT,
    PATCH,
    DELETE,
    OPTIONS,
    TRACE
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
