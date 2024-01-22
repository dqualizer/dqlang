package io.github.dqualizer.dqlang.types.dam.architecture.apischema;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.Identifiable;
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.data.DataSchema;
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.field.FieldItem;
import lombok.*;

import java.lang.module.ModuleDescriptor;
import java.util.Map;
import java.util.Set;

/**
 * General API-schema description
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class APISchema extends Identifiable {

    private ModuleDescriptor.Version version;
    private String context;
    private String api;
    @JsonProperty("server_info")
    private Set<ServerInfo> serverInfo;
    private Set<FieldItem> field;
    @JsonProperty("data_schemas")
    private Map<String, DataSchema> dataSchemas;
}
