
package types_blueprints.adapter.k6;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * K6-Configuration
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "baseURL",
    "loadTests"
})
@Generated("jsonschema2pojo")
public class K6Configuration {

    /**
     * An optional name for this configuration
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("An optional name for this configuration")
    @NotNull
    @Nonnull
    public String name;
    /**
     * BaseURL for all loadtest inside this configuration
     * (Required)
     * 
     */
    @JsonProperty("baseURL")
    @JsonPropertyDescription("BaseURL for all loadtest inside this configuration")
    @NotNull
    @Nonnull
    public String baseURL;
    /**
     * One array with multiple loadtests
     * (Required)
     * 
     */
    @JsonProperty("loadTests")
    @JsonPropertyDescription("One array with multiple loadtests")
    @Valid
    @NotNull
    @Nonnull
    public List<LoadTest> loadTests = new ArrayList<LoadTest>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public K6Configuration() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public K6Configuration(K6Configuration source) {
        super();
        this.name = source.name;
        this.baseURL = source.baseURL;
        this.loadTests = source.loadTests;
    }

    /**
     * 
     * @param baseURL
     *     BaseURL for all loadtest inside this configuration.
     * @param name
     *     An optional name for this configuration.
     * @param loadTests
     *     One array with multiple loadtests.
     */
    @ConstructorProperties({
        "name",
        "baseURL",
        "loadTests"
    })
    public K6Configuration(String name, String baseURL, List<LoadTest> loadTests) {
        super();
        this.name = name;
        this.baseURL = baseURL;
        this.loadTests = loadTests;
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
        sb.append(K6Configuration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("baseURL");
        sb.append('=');
        sb.append(((this.baseURL == null)?"<null>":this.baseURL));
        sb.append(',');
        sb.append("loadTests");
        sb.append('=');
        sb.append(((this.loadTests == null)?"<null>":this.loadTests));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.baseURL == null)? 0 :this.baseURL.hashCode()));
        result = ((result* 31)+((this.loadTests == null)? 0 :this.loadTests.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof K6Configuration) == false) {
            return false;
        }
        K6Configuration rhs = ((K6Configuration) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.baseURL == rhs.baseURL)||((this.baseURL!= null)&&this.baseURL.equals(rhs.baseURL))))&&((this.loadTests == rhs.loadTests)||((this.loadTests!= null)&&this.loadTests.equals(rhs.loadTests))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
