
package io.github.dqualizer.dqlang.types.instrumentation;

import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.Nullable;


/**
 * Instrumentation Location
 * <p>
 * Location where an instrument should be placed. The location can specify a file and a method or class name.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "file",
    "location"
})
@Generated("jsonschema2pojo")
public class InstrumentationLocation {

    /**
     * File that should be instrumented.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("file")
    @JsonPropertyDescription("File that should be instrumented.")
    public String file;
    /**
     * Method or class Name.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("location")
    @JsonPropertyDescription("Method or class Name.")
    public String location;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public InstrumentationLocation() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public InstrumentationLocation(InstrumentationLocation source) {
        super();
        this.file = source.file;
        this.location = source.location;
    }

    /**
     * 
     * @param file
     *     File that should be instrumented.
     * @param location
     *     Method or class Name.
     */
    @ConstructorProperties({
        "file",
        "location"
    })
    public InstrumentationLocation(String file, String location) {
        super();
        this.file = file;
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
        sb.append(InstrumentationLocation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
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
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.file == null)? 0 :this.file.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstrumentationLocation) == false) {
            return false;
        }
        InstrumentationLocation rhs = ((InstrumentationLocation) other);
        return ((((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location)))&&((this.file == rhs.file)||((this.file!= null)&&this.file.equals(rhs.file))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
