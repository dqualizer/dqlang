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

    private EnrichedArtifact artifact;
    @NonNull
    private String description;
    private ResilienceStimulus stimulus;
    @JsonProperty("response_measure")
    private ResilienceResponseMeasures responseMeasure;
}
