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

public class EnrichedCmsbArtifact extends Artifact {

    // used for Chaos Monkey for Spring Boot
    @JsonProperty("base_url")
    private String baseUrl;

    // used for Chaos Monkey for Spring Boot
    @JsonProperty("package_member")
    private String packageMember;

    public EnrichedCmsbArtifact(Artifact artifact, String baseUrl, String packageMember){

        this.setSystemId(artifact.getSystemId());
        this.setActivityId(artifact.getActivityId());
        this.baseUrl = baseUrl;
        this.packageMember = packageMember;
    }



}
