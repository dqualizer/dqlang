package io.github.dqualizer.dqlang.types.openapiadapter.field;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;
import java.util.Map;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FieldItem {

    private String path;
    @JsonProperty("operation_id")
    private String operationID;
    private String operation;
    private Set<Input> input;
    private Map<String, DataType> body;
    private Set<Map<String, Output>> output;
}
