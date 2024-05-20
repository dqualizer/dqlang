package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;

import javax.annotation.processing.Generated;
import java.util.List;


/**
 * Chaos Experiment for Resilience Testing
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "description",
        "secrets",
        "steady-state-hypothesis",
        "method",
        "rollbacks",
        "extensions"
})
@Generated("jsonschema2pojo")
@EqualsAndHashCode
public class CtkChaosExperiment {

    @JsonProperty(value = "title", required = true)
    @JsonPropertyDescription("Title for this CTK Chaos Experiment")
    private String title;

    @JsonProperty(value = "description", required = true)
    @JsonPropertyDescription("Description for this CTK Chaos Experiment")
    private String description;

    @JsonProperty(value = "secrets", required = false)
    private Secrets secrets;

    @JsonProperty(value = "steady-state-hypothesis", required = false)
    private SteadyStateHypothesis steadyStateHypothesis;

    @JsonProperty(value = "method", required = true)
    private List<Probe> method;

    @JsonProperty(value = "rollbacks", required = false)
    private List<Action> rollbacks;

    @JsonProperty(value = "extensions", required = false)
    private List<ResponseMeasuresExtension> extensions;

    /**
     * No args constructor for use in serialization
     */
    public CtkChaosExperiment() {
    }

    public CtkChaosExperiment(String title, String description, Secrets secrets, SteadyStateHypothesis steadyStateHypothesis, List<Probe> method, List<Action> rollbacks, List<ResponseMeasuresExtension> extensions) {
        super();
        this.title = title;
        this.description = description;
        this.secrets = secrets;
        this.steadyStateHypothesis = steadyStateHypothesis;
        this.method = method;
        this.rollbacks = rollbacks;
        this.extensions = extensions;
    }
}
