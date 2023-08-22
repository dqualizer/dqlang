package io.github.dqualizer.dqlang.types.rqa.configuration.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.Endpoint;
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact;
import io.github.dqualizer.dqlang.types.rqa.definition.Stimulus;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.ResponseMeasures;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoadTest {

    private Artifact artifact;
    @NonNull
    private String description;
    private Stimulus stimulus;
    @JsonProperty("response_measure")
    private ResponseMeasures responseMeasure;
    private Endpoint endpoint;
}
