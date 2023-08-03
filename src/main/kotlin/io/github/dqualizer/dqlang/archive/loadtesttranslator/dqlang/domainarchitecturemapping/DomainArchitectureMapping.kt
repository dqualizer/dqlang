package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

/**
 * Java class for the architecture-mapping
 */
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class DomainArchitectureMapping {
    val version: Long = 0
    val context: String? = null

    @JsonProperty("server_info")
    val serverInfo: LinkedHashSet<io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.ServerInfo>? = null
    val objects: LinkedHashSet<io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.DomainArchitectureMappingObject>? = null
}
