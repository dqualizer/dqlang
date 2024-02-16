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

    // used to kill process
    @JsonProperty("process_id")
    private String processId;

    // used to eventually restart process
    @JsonProperty("process_path")
    private String processPath;

    // used for Chaos Monkey for Spring Boot
    @JsonProperty("base_url")
    private String baseUrl;

    // used for Chaos Monkey for Spring Boot
    @JsonProperty("package_member")
    private String packageMember;

    // nodeId

    // TODO split into 2 types: enrichedProcessArtifact, enrichedChaosMonkeyArtifact
    public EnrichedArtifact(Artifact artifact, String processId, String processPath, String baseUrl, String packageMember){

        this.setSystemId(artifact.getSystemId());
        this.setActivityId(artifact.getActivityId());
        this.processId = processId;
        this.processPath = processPath;
        this.baseUrl = baseUrl;
        this.packageMember = packageMember;
    }



}
