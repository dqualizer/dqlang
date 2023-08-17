
package dqualizer.dqlang.types.adapter.k6;

import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Increasing increase in load
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start_target",
    "end_target",
    "stage_duration",
    "linear",
    "quadratic",
    "cubic"
})
@Generated("jsonschema2pojo")
public class LoadIncrease {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("start_target")
    @NotNull
    @Nonnull
    public int startTarget;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("end_target")
    @NotNull
    @Nonnull
    public int endTarget;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stage_duration")
    @NotNull
    @Nonnull
    public String stageDuration;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("linear")
    @NotNull
    @Nonnull
    public int linear;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("quadratic")
    @NotNull
    @Nonnull
    public int quadratic;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cubic")
    @NotNull
    @Nonnull
    public int cubic;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoadIncrease() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public LoadIncrease(LoadIncrease source) {
        super();
        this.startTarget = source.startTarget;
        this.endTarget = source.endTarget;
        this.stageDuration = source.stageDuration;
        this.linear = source.linear;
        this.quadratic = source.quadratic;
        this.cubic = source.cubic;
    }

    @ConstructorProperties({
        "startTarget",
        "endTarget",
        "stageDuration",
        "linear",
        "quadratic",
        "cubic"
    })
    public LoadIncrease(int startTarget, int endTarget, String stageDuration, int linear, int quadratic, int cubic) {
        super();
        this.startTarget = startTarget;
        this.endTarget = endTarget;
        this.stageDuration = stageDuration;
        this.linear = linear;
        this.quadratic = quadratic;
        this.cubic = cubic;
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
        sb.append(LoadIncrease.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startTarget");
        sb.append('=');
        sb.append(this.startTarget);
        sb.append(',');
        sb.append("endTarget");
        sb.append('=');
        sb.append(this.endTarget);
        sb.append(',');
        sb.append("stageDuration");
        sb.append('=');
        sb.append(((this.stageDuration == null)?"<null>":this.stageDuration));
        sb.append(',');
        sb.append("linear");
        sb.append('=');
        sb.append(this.linear);
        sb.append(',');
        sb.append("quadratic");
        sb.append('=');
        sb.append(this.quadratic);
        sb.append(',');
        sb.append("cubic");
        sb.append('=');
        sb.append(this.cubic);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+ this.linear);
        result = ((result* 31)+ this.cubic);
        result = ((result* 31)+ this.quadratic);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.startTarget);
        result = ((result* 31)+ this.endTarget);
        result = ((result* 31)+((this.stageDuration == null)? 0 :this.stageDuration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadIncrease) == false) {
            return false;
        }
        LoadIncrease rhs = ((LoadIncrease) other);
        return (((((((this.linear == rhs.linear)&&(this.cubic == rhs.cubic))&&(this.quadratic == rhs.quadratic))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.startTarget == rhs.startTarget))&&(this.endTarget == rhs.endTarget))&&((this.stageDuration == rhs.stageDuration)||((this.stageDuration!= null)&&this.stageDuration.equals(rhs.stageDuration))));
    }

}
