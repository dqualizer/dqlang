package dqualizer.dqlang.archive.openapiadapter.dqlang.field

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
    private val path: String? = null

    @JsonProperty("operation_id")
    private val operationID: String? = null
    private val operation: String? = null
    private val input: LinkedHashSet<Input>? = null
    private val body: Map<String, DataType>? = null
    private val output: LinkedHashSet<Map<String, Output>>? = null
}
