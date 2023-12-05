package io.github.dqualizer.dqlang.types.rqa.configuration.resilience;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.Endpoint;
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.ResponseMeasures;
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResilienceTestArtifact {

    private Artifact artifact;
    @NonNull
    private String description;
    private Stimulus stimulus;
    @JsonProperty("response_measure")
    private ResponseMeasures responseMeasure;
    private Endpoint endpoint;
}
