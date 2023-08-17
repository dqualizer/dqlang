package io.github.dqualizer.dqlang.types.adapter.k6;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Steady increase in load
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "high",
        "very_high",
        "extremely_high",
        "slow",
        "fast",
        "very_fast",
        "cool_down_duration"
})
@Generated("jsonschema2pojo")
public class LoadPeak {

    /**
     * (Required)
     */
    @JsonProperty("high")

    public int high;
    /**
     * (Required)
     */
    @JsonProperty("very_high")

    public int veryHigh;
    /**
     * (Required)
     */
    @JsonProperty("extremely_high")

    public int extremelyHigh;
    /**
     * (Required)
     */
    @JsonProperty("slow")

    public String slow;
    /**
     * (Required)
     */
    @JsonProperty("fast")

    public String fast;
    /**
     * (Required)
     */
    @JsonProperty("very_fast")

    public String veryFast;
    /**
     * (Required)
     */
    @JsonProperty("cool_down_duration")

    public String coolDownDuration;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public LoadPeak() {
    }

    /**
     * @param source the object being copied
     */
    public LoadPeak(LoadPeak source) {
        super();
        this.high = source.high;
        this.veryHigh = source.veryHigh;
        this.extremelyHigh = source.extremelyHigh;
        this.slow = source.slow;
        this.fast = source.fast;
        this.veryFast = source.veryFast;
        this.coolDownDuration = source.coolDownDuration;
    }

    @ConstructorProperties({
            "high",
            "veryHigh",
            "extremelyHigh",
            "slow",
            "fast",
            "veryFast",
            "coolDownDuration"
    })
    public LoadPeak(int high,
                    int veryHigh,
                    int extremelyHigh,
                    String slow,
                    String fast,
                    String veryFast,
                    String coolDownDuration) {
        super();
        this.high = high;
        this.veryHigh = veryHigh;
        this.extremelyHigh = extremelyHigh;
        this.slow = slow;
        this.fast = fast;
        this.veryFast = veryFast;
        this.coolDownDuration = coolDownDuration;
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
        sb.append(LoadPeak.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("high");
        sb.append('=');
        sb.append(this.high);
        sb.append(',');
        sb.append("veryHigh");
        sb.append('=');
        sb.append(this.veryHigh);
        sb.append(',');
        sb.append("extremelyHigh");
        sb.append('=');
        sb.append(this.extremelyHigh);
        sb.append(',');
        sb.append("slow");
        sb.append('=');
        sb.append(((this.slow == null) ? "<null>" : this.slow));
        sb.append(',');
        sb.append("fast");
        sb.append('=');
        sb.append(((this.fast == null) ? "<null>" : this.fast));
        sb.append(',');
        sb.append("veryFast");
        sb.append('=');
        sb.append(((this.veryFast == null) ? "<null>" : this.veryFast));
        sb.append(',');
        sb.append("coolDownDuration");
        sb.append('=');
        sb.append(((this.coolDownDuration == null) ? "<null>" : this.coolDownDuration));
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
        result = ((result * 31) + ((this.veryFast == null) ? 0 : this.veryFast.hashCode()));
        result = ((result * 31) + this.high);
        result = ((result * 31) + this.extremelyHigh);
        result = ((result * 31) + ((this.fast == null) ? 0 : this.fast.hashCode()));
        result = ((result * 31) + ((this.slow == null) ? 0 : this.slow.hashCode()));
        result = ((result * 31) + this.veryHigh);
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.coolDownDuration == null) ? 0 : this.coolDownDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadPeak) == false) {
            return false;
        }
        LoadPeak rhs = ((LoadPeak) other);
        return (((((((((this.veryFast == rhs.veryFast) || ((this.veryFast != null) && this.veryFast.equals(rhs.veryFast))) && (this.high == rhs.high)) && (this.extremelyHigh == rhs.extremelyHigh)) && ((this.fast == rhs.fast) || ((this.fast != null) && this.fast.equals(
                rhs.fast)))) && ((this.slow == rhs.slow) || ((this.slow != null) && this.slow.equals(rhs.slow)))) && (this.veryHigh == rhs.veryHigh)) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(
                rhs.additionalProperties)))) && ((this.coolDownDuration == rhs.coolDownDuration) || ((this.coolDownDuration != null) && this.coolDownDuration.equals(
                rhs.coolDownDuration))));
    }

}
