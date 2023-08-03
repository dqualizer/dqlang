package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class Endpoint {
    val field: String? = null
    val operation: String? = null

    @JsonProperty("path_variables")
    val pathVariables: Map<String, String>? = null

    @JsonProperty("url_parameter")
    val urlParameter: Map<String, String>? = null //Size should be 1

    @JsonProperty("request_parameter")
    val requestParameter: Map<String, String>? = null //Size should be 1
    val payload: Map<String, String>? = null //Size should be 1
    val responses: LinkedHashSet<io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.Response>? = null
}
