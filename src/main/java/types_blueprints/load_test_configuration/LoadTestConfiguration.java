
package dqualizer.dqlang.types.load_test_configuration;

import java.beans.ConstructorProperties;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Load Test Configuration
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "context",
    "environment",
    "base_url",
    "load_tests"
})
@Generated("jsonschema2pojo")
public class LoadTestConfiguration {

    /**
     * Version of this load test configuration
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of this load test configuration")
    @NotNull
    @Nonnull
    public int version;
    /**
     * The name of the Bounded Context to which this load test belongs
     * (Required)
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The name of the Bounded Context to which this load test belongs")
    @Size(min = 1)
    @NotNull
    @Nonnull
    public String context;
    /**
     * The environment this host belongs to
     * (Required)
     * 
     */
    @JsonProperty("environment")
    @JsonPropertyDescription("The environment this host belongs to")
    @NotNull
    @Nonnull
    public String environment;
    /**
     * URL of this host
     * (Required)
     * 
     */
    @JsonProperty("base_url")
    @JsonPropertyDescription("URL of this host")
    @NotNull
    @Nonnull
    public String baseUrl;
    /**
     * List of all loadtests in order of their execution
     * (Required)
     * 
     */
    @JsonProperty("load_tests")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of all loadtests in order of their execution")
    @Valid
    @NotNull
    @Nonnull
    public Set<LoadTest> loadTests = new LinkedHashSet<LoadTest>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public LoadTestConfiguration() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public LoadTestConfiguration(LoadTestConfiguration source) {
        super();
        this.version = source.version;
        this.context = source.context;
        this.environment = source.environment;
        this.baseUrl = source.baseUrl;
        this.loadTests = source.loadTests;
    }

    /**
     * 
     * @param environment
     *     The environment this host belongs to.
     * @param baseUrl
     *     URL of this host.
     * @param context
     *     The name of the Bounded Context to which this load test belongs.
     * @param loadTests
     *     List of all loadtests in order of their execution.
     * @param version
     *     Version of this load test configuration.
     */
    @ConstructorProperties({
        "version",
        "context",
        "environment",
        "baseUrl",
        "loadTests"
    })
    public LoadTestConfiguration(int version, String context, String environment, String baseUrl, Set<LoadTest> loadTests) {
        super();
        this.version = version;
        this.context = context;
        this.environment = environment;
        this.baseUrl = baseUrl;
        this.loadTests = loadTests;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadTestConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(this.version);
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("environment");
        sb.append('=');
        sb.append(((this.environment == null)?"<null>":this.environment));
        sb.append(',');
        sb.append("baseUrl");
        sb.append('=');
        sb.append(((this.baseUrl == null)?"<null>":this.baseUrl));
        sb.append(',');
        sb.append("loadTests");
        sb.append('=');
        sb.append(((this.loadTests == null)?"<null>":this.loadTests));
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
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.environment == null)? 0 :this.environment.hashCode()));
        result = ((result* 31)+((this.baseUrl == null)? 0 :this.baseUrl.hashCode()));
        result = ((result* 31)+((this.loadTests == null)? 0 :this.loadTests.hashCode()));
        result = ((result* 31)+ this.version);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadTestConfiguration) == false) {
            return false;
        }
        LoadTestConfiguration rhs = ((LoadTestConfiguration) other);
        return ((((((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context)))&&((this.environment == rhs.environment)||((this.environment!= null)&&this.environment.equals(rhs.environment))))&&((this.baseUrl == rhs.baseUrl)||((this.baseUrl!= null)&&this.baseUrl.equals(rhs.baseUrl))))&&((this.loadTests == rhs.loadTests)||((this.loadTests!= null)&&this.loadTests.equals(rhs.loadTests))))&&(this.version == rhs.version));
    }

}
