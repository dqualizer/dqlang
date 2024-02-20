package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
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
    public String title;

    @JsonProperty(value = "description", required = true)
    @JsonPropertyDescription("Description for this CTK Chaos Experiment")
    public String description;

    @JsonProperty(value = "secrets", required = false)
    public Secrets secrets;

    @JsonProperty(value = "steady-state-hypothesis", required = false)
    public SteadyStateHypothesis steadyStateHypothesis;

    @JsonProperty(value = "method", required = true)
    public List<Probe> method;

    @JsonProperty(value = "rollbacks", required = false)
    public List<Action> rollbacks;

    @JsonProperty(value = "extensions", required = false)
    public List<ResponseMeasuresExtension> extensions;

    @JsonIgnore
    @Valid
    public int repetitions;


    /**
     * No args constructor for use in serialization
     */
    public CtkChaosExperiment() {
    }

    /**
     * @param source the object being copied
     */
    // TODO necessary?
    public CtkChaosExperiment(CtkChaosExperiment source) {
        super();
        this.title = source.title;
        this.description = source.description;
        this.steadyStateHypothesis = source.steadyStateHypothesis;
        this.method = source.method;
        this.rollbacks = source.rollbacks;
        this.repetitions = source.repetitions;
    }

    public CtkChaosExperiment(String title, String description, List<Probe> method, int repetitions) {
        super();
        this.title = title;
        this.description = description;
        this.secrets = secrets;
        this.steadyStateHypothesis = steadyStateHypothesis;
        this.method = method;
        this.rollbacks = rollbacks;
        this.repetitions = repetitions;
    }

    public void setSecrets(Secrets secrets) {
        this.secrets = secrets;
    }

    public void setSteadyStateHypothesis(SteadyStateHypothesis steadyStateHypothesis) {
        this.steadyStateHypothesis = steadyStateHypothesis;
    }

    public void setRollbacks(List<Action> rollbacks) {
        this.rollbacks = rollbacks;
    }

    public void setExtensions(List<ResponseMeasuresExtension> extensions) {
        this.extensions = extensions;
    }
}
