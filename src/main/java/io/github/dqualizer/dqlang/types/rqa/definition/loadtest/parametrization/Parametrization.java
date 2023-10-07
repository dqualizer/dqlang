package io.github.dqualizer.dqlang.types.rqa.definition.loadtest.parametrization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parametrization {
    @JsonProperty("path_variables")
    private Set<PathVariable> pathVariables;
    @JsonProperty("url_parameter")
    private Set<UrlParameter> urlParameters;
    @JsonProperty("request_parameter")
    private Set<RequestParameter> requestParameter;
    private Payload payload;
}
