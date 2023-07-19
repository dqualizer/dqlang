
package io.github.dqualizer.dqlang.types.instrumentation;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Instrument
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metric_labels",
    "metric_name",
    "instrument_name",
    "instrument_type",
    "location"
})
@Generated("jsonschema2pojo")
public class Instrument {

    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("metric_labels")
    @Valid
    public List<String> metricLabels = new ArrayList<String>();
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("metric_name")
    public String metricName;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("instrument_name")
    public String instrumentName;
    /**
     * 
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("instrument_type")
    public Instrument.InstrumentType instrumentType;
    /**
     * Instrumentation Location
     * <p>
     * Location where an instrument should be placed. The location can specify a file and a method or class name.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("location")
    @JsonPropertyDescription("Location where an instrument should be placed. The location can specify a file and a method or class name.")
    @Valid
    public InstrumentationLocation location;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Instrument() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public Instrument(Instrument source) {
        super();
        this.metricLabels = source.metricLabels;
        this.metricName = source.metricName;
        this.instrumentName = source.instrumentName;
        this.instrumentType = source.instrumentType;
        this.location = source.location;
    }

    @ConstructorProperties({
        "metricLabels",
        "metricName",
        "instrumentName",
        "instrumentType",
        "location"
    })
    public Instrument(List<String> metricLabels, String metricName, String instrumentName, InstrumentType instrumentType, InstrumentationLocation location) {
        super();
        this.metricLabels = metricLabels;
        this.metricName = metricName;
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
        this.location = location;
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
        sb.append(Instrument.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metricLabels");
        sb.append('=');
        sb.append(((this.metricLabels == null)?"<null>":this.metricLabels));
        sb.append(',');
        sb.append("metricName");
        sb.append('=');
        sb.append(((this.metricName == null)?"<null>":this.metricName));
        sb.append(',');
        sb.append("instrumentName");
        sb.append('=');
        sb.append(((this.instrumentName == null)?"<null>":this.instrumentName));
        sb.append(',');
        sb.append("instrumentType");
        sb.append('=');
        sb.append(((this.instrumentType == null)?"<null>":this.instrumentType));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
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
        result = ((result* 31)+((this.instrumentName == null)? 0 :this.instrumentName.hashCode()));
        result = ((result* 31)+((this.instrumentType == null)? 0 :this.instrumentType.hashCode()));
        result = ((result* 31)+((this.metricName == null)? 0 :this.metricName.hashCode()));
        result = ((result* 31)+((this.metricLabels == null)? 0 :this.metricLabels.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Instrument) == false) {
            return false;
        }
        Instrument rhs = ((Instrument) other);
        return (((((((this.instrumentName == rhs.instrumentName)||((this.instrumentName!= null)&&this.instrumentName.equals(rhs.instrumentName)))&&((this.instrumentType == rhs.instrumentType)||((this.instrumentType!= null)&&this.instrumentType.equals(rhs.instrumentType))))&&((this.metricName == rhs.metricName)||((this.metricName!= null)&&this.metricName.equals(rhs.metricName))))&&((this.metricLabels == rhs.metricLabels)||((this.metricLabels!= null)&&this.metricLabels.equals(rhs.metricLabels))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    @Generated("jsonschema2pojo")
    public enum InstrumentType {

        GAUGE("gauge"),
        COUNTER("counter"),
        HISTOGRAM("histogram");
        private final String value;
        private final static Map<String, InstrumentType> CONSTANTS = new HashMap<String, InstrumentType>();

        static {
            for (InstrumentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        InstrumentType(String value) {
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
        public static InstrumentType fromValue(String value) {
            InstrumentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
