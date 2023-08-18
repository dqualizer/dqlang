package io.github.dqualizer.dqlang.draft.rqa.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.dqualizer.dqlang.draft.rqa.enums.ResultMetrics;
import io.github.dqualizer.dqlang.draft.rqa.loadtest.parametrization.Parametrization;
import io.github.dqualizer.dqlang.draft.rqa.loadtest.parametrization.ResponseMeasures;
import io.github.dqualizer.dqlang.draft.rqa.loadtest.stimulus.Stimulus;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Set;

@Data
@NoArgsConstructor
public class Loadtest {
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

    public Loadtest(String name, Artifact artifact, String description, Stimulus stimulus, Parametrization parametrization, ResponseMeasures responseMeasures, Set<ResultMetrics> resultMetrics) {
        this.name = name;
        this.artifact = artifact;
        this.description = description;
        this.stimulus = stimulus;
        this.parametrization = parametrization;
        this.responseMeasures = responseMeasures;
        this.resultMetrics = resultMetrics;
    }
}
