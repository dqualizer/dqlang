package io.github.dqualizer.dqlang.types.domain_architecture_mapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Response;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Endpoint {

    private String field;
    private String operation;
    @JsonProperty("path_variables")
    private Map<String, String> pathVariables;
    @JsonProperty("url_parameter")
    private Map<String, String> urlParameter;
    @JsonProperty("request_parameter")
    private Map<String, String> requestParameter;
    private Map<String, String> payload;
    private Set<Response> responses;
}
