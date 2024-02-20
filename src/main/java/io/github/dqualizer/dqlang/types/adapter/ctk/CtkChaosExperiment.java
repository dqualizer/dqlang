package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
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
        "rollbacks"
})
@Generated("jsonschema2pojo")
@EqualsAndHashCode
public class CtkChaosExperiment {

    @JsonProperty(value = "title", required = true)
    @JsonPropertyDescription("Title for this CTK Chaos Experiment")
    public String title;

    @JsonProperty(value = "description", required = true)
    @JsonPropertyDescription("Description for this CTK Chaos Experiment")
    @Valid
    public String description;

    @JsonProperty(value = "secrets", required = false)
    @Valid
    public Secrets secrets;

    @JsonProperty(value = "steady-state-hypothesis", required = false)
    @Valid
    public SteadyStateHypothesis steadyStateHypothesis;

    @JsonProperty(value = "method", required = true)
    @Valid
    public List<Probe> method;

    @JsonProperty(value = "rollbacks", required = false)
    @Valid
    public List<Action> rollbacks;

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


    /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ctkChaosExperiment.class.getName())
                .append('@')
                .append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("repetition");
        sb.append('=');
        sb.append(this.repetition);
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null) ? "<null>" : this.options));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null) ? "<null>" : this.request));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
*/

   /* @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.options == null) ? 0 : this.options.hashCode()));
        result = ((result * 31) + ((this.request == null) ? 0 : this.request.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.repetition);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ctkChaosExperiment) == false) {
            return false;
        }
        ctkChaosExperiment rhs = ((ctkChaosExperiment) other);
        return (((((this.options == rhs.options) || ((this.options != null) && this.options.equals(rhs.options))) && ((this.request == rhs.request) || ((this.request != null) && this.request.equals(
                rhs.request)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(
                rhs.additionalProperties)))) && (this.repetition == rhs.repetition));
    }*/

}
