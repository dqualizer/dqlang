package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Endpoint {
    val field: String? = null
    val operation: String? = null

    @JsonProperty("path_variables")
    val pathVariables: Map<String, String>? = null

    @JsonProperty("url_parameter")
    val urlParameter: Map<String, String>? = null

    @JsonProperty("request_parameter")
    val requestParameter: Map<String, String>? = null
    val payload: Map<String, String>? = null
    val responses: LinkedHashSet<io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Response>? = null
}
