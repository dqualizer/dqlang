package io.github.dqualizer.dqlang.types.dam.architecture.apischema

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.dam.Identifiable
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.data.DataSchema
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.field.FieldItem
import lombok.*
import java.lang.module.ModuleDescriptor

data class APISchema(
    val version: ModuleDescriptor.Version? = null,

    val context: String? = null,

    val api: String? = null,

    @JsonProperty("server_info")
    val serverInfo: Set<ServerInfo>? = HashSet(),

    val field: Set<FieldItem>? = HashSet(),

    @JsonProperty("data_schemas")
    private val dataSchemas: Map<String, DataSchema>? = HashMap()
): Identifiable()

