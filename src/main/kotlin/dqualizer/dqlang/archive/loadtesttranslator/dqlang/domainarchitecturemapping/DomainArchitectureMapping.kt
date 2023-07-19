package dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

/**
 * Java class for the architecture-mapping
 */
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class DomainArchitectureMapping {
    private val version: Long = 0
    private val context: String? = null

    @JsonProperty("server_info")
    private val serverInfo: LinkedHashSet<ServerInfo>? = null
    private val objects: LinkedHashSet<DomainArchitectureMappingObject>? = null
}
