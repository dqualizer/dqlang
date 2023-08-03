package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class DomainArchitectureMappingObject {
    @JsonProperty("dq_id")
    val dqID: String? = null
    val name: String? = null

    @JsonProperty("operation_id")
    val operationID: String? = null
    val type: String? = null

    @JsonProperty("implements")
    val implementations: LinkedHashSet<String>? = null
    val objects: LinkedHashSet<String>? = null
    val activities: LinkedHashSet<io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Activity>? = null
}
