package io.github.dqualizer.dqlang.types.rqa.definition.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parametrization {
    @JsonProperty("path_variables")
    private Map<String, String> pathVariables;
}
