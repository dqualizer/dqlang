package io.github.dqualizer.dqlang.types.dam;

import lombok.Data;

import java.util.List;

@Data
public class Endpoint {
    private String field;
    private String operation;
    private List<PathVariable> path_variables;
    private List<UrlParameter> url_parameter;
    private List<RequestParameter> request_parameter;
    private Payload payload;
    private List<Response> responses;
}
