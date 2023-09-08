package io.github.dqualizer.dqlang.types.adapter.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private String type;
    private String path;
    @JsonProperty("path_variables")
    private List<String> pathVariables;
    @JsonProperty("query_params")
    private List<String> queryParams;
    private List<String> params;
    private List<String> payload;
    private Checks checks;
}
