
package types_blueprints.adapter.k6;

import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * LoadTest
 * <p>
 * Workload test definition
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "repetition",
    "options",
    "request"
})
@Generated("jsonschema2pojo")
public class LoadTest {

    /**
     * How many times should this load test be executed
     * (Required)
     * 
     */
    @JsonProperty("repetition")
    @JsonPropertyDescription("How many times should this load test be executed")
    @NotNull
    @Nonnull
    public int repetition;
    /**
     * Configuration for k6, for more info see here: https://k6.io/docs/using-k6/k6-options/reference/
     * (Required)
     * 
     */
    @JsonProperty("options")
    @JsonPropertyDescription("Configuration for k6, for more info see here: https://k6.io/docs/using-k6/k6-options/reference/")
    @Valid
    @NotNull
    @Nonnull
    public Options options;
    /**
     * Request
     * <p>
     * Information for the k6 'default function()' that will send requests to one endpoint
     * (Required)
     * 
     */
    @Nullable
    @JsonProperty("request")
    @JsonPropertyDescription("Information for the k6 'default function()' that will send requests to one endpoint")
    @Valid
    @NotNull
    @Nonnull
    public Request request;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoadTest() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public LoadTest(LoadTest source) {
        super();
        this.repetition = source.repetition;
        this.options = source.options;
        this.request = source.request;
    }

    /**
     * 
     * @param options
     *     Configuration for k6, for more info see here: https://k6.io/docs/using-k6/k6-options/reference/.
     * @param repetition
     *     How many times should this load test be executed.
     */
    @ConstructorProperties({
        "repetition",
        "options",
        "request"
    })
    public LoadTest(int repetition, Options options, Request request) {
        super();
        this.repetition = repetition;
        this.options = options;
        this.request = request;
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
        sb.append(LoadTest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("repetition");
        sb.append('=');
        sb.append(this.repetition);
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null)?"<null>":this.options));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
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
        result = ((result* 31)+((this.options == null)? 0 :this.options.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.repetition);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadTest) == false) {
            return false;
        }
        LoadTest rhs = ((LoadTest) other);
        return (((((this.options == rhs.options)||((this.options!= null)&&this.options.equals(rhs.options)))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.repetition == rhs.repetition));
    }

}
