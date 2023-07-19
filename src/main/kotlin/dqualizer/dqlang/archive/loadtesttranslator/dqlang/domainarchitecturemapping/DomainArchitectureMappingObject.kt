package dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class DomainArchitectureMappingObject {
    @JsonProperty("dq_id")
    private val dqID: String? = null
    private val name: String? = null

    @JsonProperty("operation_id")
    private val operationID: String? = null
    private val type: String? = null

    @JsonProperty("implements")
    private val implementations: LinkedHashSet<String>? = null
    private val objects: LinkedHashSet<String>? = null
    private val activities: LinkedHashSet<Activity>? = null
}
