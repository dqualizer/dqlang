package io.github.dqualizer.dqlang.types.openapiadapter;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.openapiadapter.data.DataSchema;
import io.github.dqualizer.dqlang.types.openapiadapter.field.FieldItem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;
import java.util.Set;

/**
 * Java class for the dqlang API-schema
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
