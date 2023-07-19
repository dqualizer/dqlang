package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class Activity {
    @JsonProperty("dq_id")
    private val dqID: String? = null
    private val name: String? = null

    @JsonProperty("operation_id")
    private val operationID: String? = null
    private val type: String? = null
    private val parameter: LinkedHashSet<String>? = null
    private val endpoint: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Endpoint? = null
}
