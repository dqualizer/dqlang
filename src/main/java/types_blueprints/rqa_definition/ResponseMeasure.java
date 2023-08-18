
package types_blueprints.rqa_definition;

import java.beans.ConstructorProperties;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "response_time"
})
@Generated("jsonschema2pojo")
public class ResponseMeasure {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("response_time")
    @JsonPropertyDescription("")
    @NotNull
    @Nonnull
    public ResponseMeasure.ResponseTime responseTime;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseMeasure() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public ResponseMeasure(ResponseMeasure source) {
        super();
        this.responseTime = source.responseTime;
    }

    @ConstructorProperties({
        "responseTime"
    })
    public ResponseMeasure(ResponseMeasure.ResponseTime responseTime) {
        super();
        this.responseTime = responseTime;
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
        sb.append(ResponseMeasure.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("responseTime");
        sb.append('=');
        sb.append(((this.responseTime == null)?"<null>":this.responseTime));
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
        result = ((result* 31)+((this.responseTime == null)? 0 :this.responseTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseMeasure) == false) {
            return false;
        }
        ResponseMeasure rhs = ((ResponseMeasure) other);
        return (((this.responseTime == rhs.responseTime)||((this.responseTime!= null)&&this.responseTime.equals(rhs.responseTime)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ResponseTime {

        SATISFIED("SATISFIED"),
        TOLERATED("TOLERATED"),
        FRUSTRATED("FRUSTRATED");
        private final String value;
        private final static Map<String, ResponseMeasure.ResponseTime> CONSTANTS = new HashMap<String, ResponseMeasure.ResponseTime>();

        static {
            for (ResponseMeasure.ResponseTime c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ResponseTime(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ResponseMeasure.ResponseTime fromValue(String value) {
            ResponseMeasure.ResponseTime constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
