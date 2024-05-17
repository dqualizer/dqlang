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
    @JsonProperty("enriched_process_artifact")
    private EnrichedProcessArtifact enrichedProcessArtifact;
    @JsonProperty("enriched_cmsb_artifact")
    private EnrichedCmsbArtifact enrichedCmsbArtifact;
    @NonNull
    private ResilienceStimulus stimulus;
    @JsonProperty("response_measure")
    private ResilienceResponseMeasures responseMeasure;
}
