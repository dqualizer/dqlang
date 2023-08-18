package io.github.dqualizer.dqlang.types.rqa_definition;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
public class Parametrization {

    @JsonProperty("path_variables")
    private Map<String, String> pathVariables;
    @JsonProperty("url_parameter")
    private Map<String, String> urlParameter;
    @JsonProperty("request_parameter")
    private Map<String, String> requestParameter;
    private String payload;
}
