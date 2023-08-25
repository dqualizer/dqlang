package io.github.dqualizer.dqlang.types.rqa.configuration.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class LoadTestConfiguration {

    private String version;
    private String context;
    private String environment;
    @JsonProperty("base_url")
    private String baseURL;
    @JsonProperty("load_tests")
    private Set<LoadTestArtifact> loadTestArtifacts;
}
