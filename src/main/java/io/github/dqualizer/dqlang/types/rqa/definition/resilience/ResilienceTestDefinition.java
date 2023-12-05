package io.github.dqualizer.dqlang.types.rqa.definition.resilience;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.ResultMetrics;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.Parametrization;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.ResponseMeasures;
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Set;

@Data
@NoArgsConstructor
public class ResilienceTestDefinition {
    @Indexed(unique = true)
    private String name;
    private Artifact artifact;
    private String description;
    private Stimulus stimulus;
    private Parametrization parametrization;
    @JsonProperty("response_measure")
    private ResponseMeasures responseMeasures;
    @JsonProperty("result_metrics")
    private Set<ResultMetrics> resultMetrics;

    public ResilienceTestDefinition(String name, Artifact artifact, String description, Stimulus stimulus, Parametrization parametrization, ResponseMeasures responseMeasures, Set<ResultMetrics> resultMetrics) {
        this.name = name;
        this.artifact = artifact;
        this.description = description;
        this.stimulus = stimulus;
        this.parametrization = parametrization;
        this.responseMeasures = responseMeasures;
        this.resultMetrics = resultMetrics;
    }
}
