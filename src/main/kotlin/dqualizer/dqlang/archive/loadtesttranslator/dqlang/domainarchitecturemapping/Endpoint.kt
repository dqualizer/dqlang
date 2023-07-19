package dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

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
    private val field: String? = null
    private val operation: String? = null

    @JsonProperty("path_variables")
    private val pathVariables: Map<String, String>? = null

    @JsonProperty("url_parameter")
    private val urlParameter: Map<String, String>? = null

    @JsonProperty("request_parameter")
    private val requestParameter: Map<String, String>? = null
    private val payload: Map<String, String>? = null
    private val responses: LinkedHashSet<Response>? = null
}
