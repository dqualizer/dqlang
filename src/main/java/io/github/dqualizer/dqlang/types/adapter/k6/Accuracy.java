package io.github.dqualizer.dqlang.types.adapter.k6;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * An object with lower and upper boundaries to determine a accuracy
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "repetition"
})
@Generated("jsonschema2pojo")
public class Accuracy {

    /**
     * Lower an upper boundaries for repetitions
     */

    @JsonProperty("repetition")
    @JsonPropertyDescription("Lower an upper boundaries for repetitions")
    @Valid
    public Repetition repetition;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Accuracy() {
    }

    /**
     * @param source the object being copied
     */
    public Accuracy(Accuracy source) {
        super();
        this.repetition = source.repetition;
    }

    /**
     * @param repetition Lower an upper boundaries for repetitions.
     */
    @ConstructorProperties({
            "repetition"
    })
    public Accuracy(Repetition repetition) {
        super();
        this.repetition = repetition;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Accuracy.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("repetition");
        sb.append('=');
        sb.append(((this.repetition == null) ? "<null>" : this.repetition));
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.repetition == null) ? 0 : this.repetition.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Accuracy) == false) {
            return false;
        }
        Accuracy rhs = ((Accuracy) other);
        return (((this.repetition == rhs.repetition) || ((this.repetition != null) && this.repetition.equals(rhs.repetition))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(
                rhs.additionalProperties))));
    }

}
