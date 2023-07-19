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
    private val type: String? = null
    private val path: String? = null

    @JsonProperty("path_variables")
    private val pathVariables: Map<String, String>? = null

    @JsonProperty("query_params")
    private val queryParams: Map<String, String>? = null
    private val params: Map<String, String>? = null
    private val payload: Map<String, String>? = null
    private val checks: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.request.Checks? = null
}
