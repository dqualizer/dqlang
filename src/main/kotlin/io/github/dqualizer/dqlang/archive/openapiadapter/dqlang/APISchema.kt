package io.github.dqualizer.dqlang.archive.openapiadapter.dqlang

/**
 * Java class for the dqlang API-schema
 */
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.data.DataSchema
import io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field.FieldItem
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class APISchema {
    val version = 1
    val context: String? = null
    val api: String? = null

    @JsonProperty("server_info")
    val serverInfo: LinkedHashSet<io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.ServerInfo>? = null
    val field: LinkedHashSet<io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field.FieldItem>? = null

    @JsonProperty("data_schemas")
    val dataSchemas: Map<String, io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.data.DataSchema>? = null
}
