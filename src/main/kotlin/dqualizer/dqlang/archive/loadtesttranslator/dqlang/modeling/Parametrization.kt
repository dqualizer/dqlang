package dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class Parametrization {
    @JsonProperty("path_variables")
    private val pathVariables: Map<String, String>? = null

    @JsonProperty("url_parameter")
    private val urlParameter: Map<String, String>? = null //Size should be 1

    @JsonProperty("request_parameter")
    private val requestParameter: Map<String, String>? = null //Size should be 1
    private val payload: Map<String, String>? = null //Size should be 1
}
