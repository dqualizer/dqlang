package io.github.dqualizer.dqlang.types_new.dam;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.LinkedHashSet;

/**
 * Java class for the architecture-mapping
 */
@Getter
@ToString
public class DomainArchitectureMapping {

    private long version;
    private String context;
    @JsonProperty("server_info")
    private LinkedHashSet<ServerInfo> serverInfo;
    private LinkedHashSet<DomainArchitectureMappingObject> objects;
}