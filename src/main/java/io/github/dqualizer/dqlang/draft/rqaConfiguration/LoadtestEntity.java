package io.github.dqualizer.dqlang.draft.rqaConfiguration;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.dqualizer.dqlang.draft.dam.Endpoint;
import io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest.Artifact;
import io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest.parametrization.ResponseMeasures;
import io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest.stimulus.Stimulus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoadtestEntity {
    private Artifact artifact;
    private String description;
    private Stimulus stimulus;
    @JsonProperty("response_measures")
    private ResponseMeasures responseMeasures;
    private Endpoint endpoint;
}
