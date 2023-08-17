package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa_definition.Artifact;
import io.github.dqualizer.dqlang.types.rqa_definition.ResponseMeasure;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoadTest {

    private Artifact artifact;
    @NonNull private String description;
    private Stimulus stimulus;
    @JsonProperty("response_measure")
    private ResponseMeasure responseMeasure;
    private Endpoint endpoint;
}
