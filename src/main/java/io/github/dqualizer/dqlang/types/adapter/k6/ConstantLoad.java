package io.github.dqualizer.dqlang.types.adapter.k6;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Constant load throughout the whole test
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "low",
        "medium",
        "high",
        "min_duration",
        "max_duration"
})
@Generated("jsonschema2pojo")
public class ConstantLoad {

    /**
     * (Required)
     */
    @JsonProperty("low")

    public int low;
    /**
     * (Required)
     */
    @JsonProperty("medium")

    public int medium;
    /**
     * (Required)
     */
    @JsonProperty("high")

    public int high;
    /**
     * Min duration in milliseconds (Required)
     */
    @JsonProperty("min_duration")
    @JsonPropertyDescription("Min duration in milliseconds")

    public int minDuration;
    /**
     * Max duration in milliseconds (Required)
     */
    @JsonProperty("max_duration")
    @JsonPropertyDescription("Max duration in milliseconds")

    public int maxDuration;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ConstantLoad() {
    }

    /**
     * @param source the object being copied
     */
    public ConstantLoad(ConstantLoad source) {
        super();
        this.low = source.low;
        this.medium = source.medium;
        this.high = source.high;
        this.minDuration = source.minDuration;
        this.maxDuration = source.maxDuration;
    }

    /**
     * @param minDuration Min duration in milliseconds.
     * @param maxDuration Max duration in milliseconds.
     */
    @ConstructorProperties({
            "low",
            "medium",
            "high",
            "minDuration",
            "maxDuration"
    })
    public ConstantLoad(int low, int medium, int high, int minDuration, int maxDuration) {
        super();
        this.low = low;
        this.medium = medium;
        this.high = high;
        this.minDuration = minDuration;
        this.maxDuration = maxDuration;
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
        sb.append(ConstantLoad.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("low");
        sb.append('=');
        sb.append(this.low);
        sb.append(',');
        sb.append("medium");
        sb.append('=');
        sb.append(this.medium);
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(this.high);
        sb.append(',');
        sb.append("minDuration");
        sb.append('=');
        sb.append(this.minDuration);
        sb.append(',');
        sb.append("maxDuration");
        sb.append('=');
        sb.append(this.maxDuration);
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
        result = ((result * 31) + this.high);
        result = ((result * 31) + this.minDuration);
        result = ((result * 31) + this.low);
        result = ((result * 31) + this.medium);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + this.maxDuration);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstantLoad) == false) {
            return false;
        }
        ConstantLoad rhs = ((ConstantLoad) other);
        return ((((((this.high == rhs.high) && (this.minDuration == rhs.minDuration)) && (this.low == rhs.low)) && (this.medium == rhs.medium)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(
                rhs.additionalProperties)))) && (this.maxDuration == rhs.maxDuration));
    }

}
