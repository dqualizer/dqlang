package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.PathVariable;
import io.github.dqualizer.dqlang.types.dam.Payload;
import io.github.dqualizer.dqlang.types.dam.RequestParameter;
import io.github.dqualizer.dqlang.types.dam.UrlParameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResilienceParametrization {
    // TODO adapt
    @JsonProperty("path_variables")
    private Set<PathVariable> pathVariables;
    @JsonProperty("url_parameter")
    private Set<UrlParameter> urlParameters;
    @JsonProperty("request_parameter")
    private Set<RequestParameter> requestParameter;
    private Payload payload;
}
