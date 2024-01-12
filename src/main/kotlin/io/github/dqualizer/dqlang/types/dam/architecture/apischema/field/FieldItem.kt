package io.github.dqualizer.dqlang.types.dam.architecture.apischema.field

import com.fasterxml.jackson.annotation.JsonProperty

data class FieldItem(
    val path: String? = null,

    @JsonProperty("operation_id")
    val operationID: String? = null,

    val operation: String? = null,

    val input: Set<Input>? = HashSet(),

    val body: Map<String, DataType>? = HashMap(),

    val output: Set<Map<String, Output>>? = HashSet()
)
