package io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class FieldItem {
    val path: String? = null

    @JsonProperty("operation_id")
    val operationID: String? = null
    val operation: String? = null
    val input: LinkedHashSet<io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field.Input>? = null
    val body: Map<String, io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field.DataType>? = null
    val output: LinkedHashSet<Map<String, io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field.Output>>? = null
}
