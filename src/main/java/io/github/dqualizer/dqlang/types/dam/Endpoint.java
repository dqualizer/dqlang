package io.github.dqualizer.dqlang.types.dam;

import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.PathVariable;
import lombok.Data;

import java.util.Map;

@Data
public class Endpoint {
    private String field;
    private String operation;
    private Map<PathVariable, String> path_variables;
    private Map<Object, String> url_parameter;
    private Map<RequestParameter, String> request_parameter;
    private Map<Payload, String> payload;
    private List<Response> responses;
}
