package io.github.dqualizer.dqlang.types.dam;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainArchitectureMapping {
    @Id
    private String id;
    private int version;
    private String context;
    @JsonProperty("server_infos")
    private Set<ServerInfo> serverInfos;
    private Set<Actor> actors;
    private Set<System> systems;

    private SoftwareSystem softwareSystem = null;

}
