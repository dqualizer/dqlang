package io.github.dqualizer.dqlang.types.adapter.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.dqualizer.dqlang.types.dam.Payload;
import io.github.dqualizer.dqlang.types.dam.RequestParameter;
import io.github.dqualizer.dqlang.types.dam.PathVariable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private String type;
    private String path;
    @JsonProperty("path_variables")
    private List<PathVariable> pathVariables = new ArrayList<>();
    @JsonProperty("query_params")
    private List<Object> queryParams = new ArrayList<>();
    @JsonProperty("request_params")
    private List<RequestParameter> requestParameters = new ArrayList<>();
    private List<Payload> payload = new ArrayList<>();
    private Checks checks;
}
