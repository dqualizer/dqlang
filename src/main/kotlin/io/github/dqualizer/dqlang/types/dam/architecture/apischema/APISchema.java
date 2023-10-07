package io.github.dqualizer.dqlang.types.dam.architecture.apischema;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.data.DataSchema;
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.field.FieldItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;
import java.util.Set;

/**
 * General API-schema description
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class APISchema {

    private int version;
    private String context;
    private String api;
    @JsonProperty("server_info")
    private Set<ServerInfo> serverInfo;
    private Set<FieldItem> field;
    @JsonProperty("data_schemas")
    private Map<String, DataSchema> dataSchemas;
}
