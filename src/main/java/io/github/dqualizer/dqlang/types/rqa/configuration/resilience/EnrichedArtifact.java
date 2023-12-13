package io.github.dqualizer.dqlang.types.rqa.configuration.resilience;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.Artifact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor

public class EnrichedArtifact extends Artifact {

    @JsonProperty("process_id")
    private String processId;

    @JsonProperty("process_path")
    private String processPath;

    // nodeId

    public EnrichedArtifact(Artifact artifact, String processId, String processPath){

        this.setSystemId(artifact.getSystemId());
        this.setActivityId(artifact.getActivityId());
        this.processId = processId;
        this.processPath = processPath;
    }
}
