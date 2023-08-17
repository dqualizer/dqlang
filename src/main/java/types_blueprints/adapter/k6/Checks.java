
package dqualizer.dqlang.types.adapter.k6;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Values that should be checked by k6
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status_codes",
    "duration"
})
@Generated("jsonschema2pojo")
public class Checks {

    /**
     * Expected status codes for this endpoint
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("status_codes")
    @JsonPropertyDescription("Expected status codes for this endpoint")
    @Valid
    public List<Integer> statusCodes = new ArrayList<Integer>();
    /**
     * Expected duration for this endpoint in milliseconds
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("duration")
    @JsonPropertyDescription("Expected duration for this endpoint in milliseconds")
    public int duration;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Checks() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public Checks(Checks source) {
        super();
        this.statusCodes = source.statusCodes;
        this.duration = source.duration;
    }

    /**
     * 
     * @param statusCodes
     *     Expected status codes for this endpoint.
     * @param duration
     *     Expected duration for this endpoint in milliseconds.
     */
    @ConstructorProperties({
        "statusCodes",
        "duration"
    })
    public Checks(List<Integer> statusCodes, int duration) {
        super();
        this.statusCodes = statusCodes;
        this.duration = duration;
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
        sb.append(Checks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusCodes");
        sb.append('=');
        sb.append(((this.statusCodes == null)?"<null>":this.statusCodes));
        sb.append(',');
        sb.append("duration");
        sb.append('=');
        sb.append(this.duration);
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
        result = ((result* 31)+((this.statusCodes == null)? 0 :this.statusCodes.hashCode()));
        result = ((result* 31)+ this.duration);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checks) == false) {
            return false;
        }
        Checks rhs = ((Checks) other);
        return ((((this.statusCodes == rhs.statusCodes)||((this.statusCodes!= null)&&this.statusCodes.equals(rhs.statusCodes)))&&(this.duration == rhs.duration))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
