package io.github.dqualizer.dqlang.types.dam.architecture.apischema.field;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;
import java.util.Set;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FieldItem {

    private String path;
    @JsonProperty("operation_id")
    private String operationID;
    private String operation;
    private Set<Input> input;
    private Map<String, DataType> body;
    private Set<Map<String, Output>> output;
}
