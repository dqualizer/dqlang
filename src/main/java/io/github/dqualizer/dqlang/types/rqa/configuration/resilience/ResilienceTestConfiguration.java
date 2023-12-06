package io.github.dqualizer.dqlang.types.rqa.configuration.resilience;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

/**
 * Java class for the general dqualizer resilience configuration
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

// TODO eventually refactor later to a configuration being ONE enrichedResilienceTestDefinition, necessary e.g. to run multiple tests in different environments, but first leave it like this because of major technical consequences of this refactoring

public class ResilienceTestConfiguration {

    private String version;
    private String context;
    private String environment;
 /*   @JsonProperty("base_url")
    private String baseURL;*/
    @JsonProperty("resilience_tests")
    private Set<EnrichedResilienceTestDefinition> enrichedResilienceTestDefinitions;
}
