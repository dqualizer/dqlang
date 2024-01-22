package io.github.dqualizer.dqlang.types.rqa.configuration.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.architecture.RESTEndpoint;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.Artifact;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.ResponseMeasures;
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoadTestArtifact {

    private Artifact artifact;
    @NonNull
    private String description;
    private Stimulus stimulus;
    @JsonProperty("response_measure")
    private ResponseMeasures responseMeasure;
    private RESTEndpoint HTTPEndpoint;
}
