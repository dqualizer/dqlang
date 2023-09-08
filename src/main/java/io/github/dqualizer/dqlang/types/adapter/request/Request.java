package io.github.dqualizer.dqlang.types.adapter.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private String type;
    private String path;
    @JsonProperty("path_variables")
    private Map<String, String> pathVariables;
    @JsonProperty("query_params")
    private List<String, String> queryParams;
    private List<String, String> params;
    private List<String, String> payload;
    private Checks checks;
}
