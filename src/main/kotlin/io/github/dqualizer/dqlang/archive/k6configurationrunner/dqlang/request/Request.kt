package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.request

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.request.Checks
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Request {
    val type: String? = null
    val path: String? = null

    @JsonProperty("path_variables")
    val pathVariables: Map<String, String>? = null

    @JsonProperty("query_params")
    val queryParams: Map<String, String>? = null
    val params: Map<String, String>? = null
    val payload: Map<String, String>? = null
    val checks: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.request.Checks? = null
}
