package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;


/**
 * Chaos Experiment for Resilience Testing
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "description",
        "steady-state-hypothesis",
        "method",
        "rollbacks"
})
@Generated("jsonschema2pojo")
public class CtkChaosExperiment {

    @JsonProperty("title")
    @JsonPropertyDescription("Title for this CTK Chaos Experiment")
    public String title;

    @JsonProperty("description")
    @JsonPropertyDescription("Description for this CTK Chaos Experiment")
    @Valid
    public String description;

    @JsonProperty("steady-state-hypothesis")
    @Valid
    public SteadyStateHypothesis steadyStateHypothesis;

    @JsonProperty("method")
    @Valid
    public Method method;

    @JsonProperty("rollbacks")
    @Valid
    public Rollbacks rollbacks;


    /**
     * No args constructor for use in serialization
     */
    public CtkChaosExperiment() {
    }

    /**
     * @param source the object being copied
     */
    public CtkChaosExperiment(CtkChaosExperiment source) {
        super();
        this.title = source.title;
        this.description = source.description;
        this.steadyStateHypothesis = source.steadyStateHypothesis;
        this.method = source.method;
        this.rollbacks = source.rollbacks;
    }


    @ConstructorProperties({
            "title",
            "description",
            "steadyStateHypothesis",
            "method",
            "rollbacks"
    })
    public CtkChaosExperiment(String title, String description, SteadyStateHypothesis steadyStateHypothesis, Method method, Rollbacks rollbacks) {
        super();
        this.title = title;
        this.description = description;
        this.steadyStateHypothesis = steadyStateHypothesis;
        this.method = method;
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
