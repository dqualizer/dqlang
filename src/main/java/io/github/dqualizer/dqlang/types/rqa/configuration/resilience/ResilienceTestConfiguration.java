package io.github.dqualizer.dqlang.types.rqa.configuration.resilience;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.configuration.loadtest.LoadTestArtifact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

/**
 * Java class for the general dqualizer loadtest configuration
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResilienceTestConfiguration {

    private String version;
    private String context;
    private String environment;
    @JsonProperty("base_url")
    private String baseURL;
    @JsonProperty("resilience_tests")
    private Set<ResilienceTestArtifact> resilienceTestArtifacts;
}
