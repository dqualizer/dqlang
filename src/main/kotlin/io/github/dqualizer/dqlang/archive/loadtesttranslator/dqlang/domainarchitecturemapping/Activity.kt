package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class Activity {
    @JsonProperty("dq_id")
    val dqID: String? = null
    val name: String? = null

    @JsonProperty("operation_id")
    val operationID: String? = null
    val type: String? = null
    val parameter: LinkedHashSet<String>? = null
    val endpoint: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Endpoint? = null
}
