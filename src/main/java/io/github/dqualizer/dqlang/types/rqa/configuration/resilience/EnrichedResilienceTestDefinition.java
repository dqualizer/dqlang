package io.github.dqualizer.dqlang.types.rqa.configuration.resilience;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.ResilienceResponseMeasures;
import io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus.ResilienceStimulus;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class EnrichedResilienceTestDefinition {

    @NonNull
    private String name;
    @NonNull
    private String description;
    private EnrichedArtifact artifact;
    private ResilienceStimulus stimulus;
    @JsonProperty("response_measure")
    private ResilienceResponseMeasures responseMeasure;
}
