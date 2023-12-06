package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact;
import io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus.ResilienceStimulus;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@NoArgsConstructor
public class ResilienceTestDefinition {
    @Indexed(unique = true)
    private String name;
    private Artifact artifact;
    private String description;

    private ResilienceStimulus stimulus;

    //private ResilienceParametrization parametrization;

    @JsonProperty("response_measure")
    private ResilienceResponseMeasures responseMeasures;
    //@JsonProperty("result_metrics")
    //private Set<ResultMetrics> resultMetrics;

    public ResilienceTestDefinition(String name, Artifact artifact, String description, ResilienceStimulus stimulus, ResilienceResponseMeasures responseMeasures) {
        this.name = name;
        this.artifact = artifact;
        this.description = description;
        this.stimulus = stimulus;
        this.responseMeasures = responseMeasures;
    }
}
