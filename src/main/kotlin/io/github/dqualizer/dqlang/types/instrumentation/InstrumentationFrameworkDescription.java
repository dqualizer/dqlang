
package io.github.dqualizer.dqlang.types.instrumentation;

import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
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
 * InstrumentationFrameworkDescription
 * <p>
 * A generic description of an instrumentation framework. 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "existing",
    "enabled_metrics",
    "enabled_traces",
    "enabled_logs",
    "framework_options"
})
@Generated("jsonschema2pojo")
public class InstrumentationFrameworkDescription {

    /**
     * The name of the instrumentation framework
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the instrumentation framework")
    public String name;
    /**
     * Whether the instrumentation framework is already installed
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("existing")
    @JsonPropertyDescription("Whether the instrumentation framework is already installed")
    public boolean existing;
    /**
     * Whether metrics export is enabled for the instrumentation framework
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("enabled_metrics")
    @JsonPropertyDescription("Whether metrics export is enabled for the instrumentation framework")
    public boolean enabledMetrics;
    /**
     * Whether traces export is enabled for the instrumentation framework
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("enabled_traces")
    @JsonPropertyDescription("Whether traces export is enabled for the instrumentation framework")
    public boolean enabledTraces;
    /**
     * Whether log export is enabled for the instrumentation framework
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("enabled_logs")
    @JsonPropertyDescription("Whether log export is enabled for the instrumentation framework")
    public boolean enabledLogs;
    /**
     * Map of options, specific to the instrumentation framework, which should be passed to the agent.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("framework_options")
    @JsonPropertyDescription("Map of options, specific to the instrumentation framework, which should be passed to the agent.")
    @Valid
    public Map<String, String> frameworkOptions;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public InstrumentationFrameworkDescription() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public InstrumentationFrameworkDescription(InstrumentationFrameworkDescription source) {
        super();
        this.name = source.name;
        this.existing = source.existing;
        this.enabledMetrics = source.enabledMetrics;
        this.enabledTraces = source.enabledTraces;
        this.enabledLogs = source.enabledLogs;
        this.frameworkOptions = source.frameworkOptions;
    }

    /**
     * 
     * @param existing
     *     Whether the instrumentation framework is already installed.
     * @param enabledTraces
     *     Whether traces export is enabled for the instrumentation framework.
     * @param name
     *     The name of the instrumentation framework.
     * @param enabledMetrics
     *     Whether metrics export is enabled for the instrumentation framework.
     * @param enabledLogs
     *     Whether log export is enabled for the instrumentation framework.
     * @param frameworkOptions
     *     Map of options, specific to the instrumentation framework, which should be passed to the agent.
     */
    @ConstructorProperties({
        "name",
        "existing",
        "enabledMetrics",
        "enabledTraces",
        "enabledLogs",
        "frameworkOptions"
    })
    public InstrumentationFrameworkDescription(String name, boolean existing, boolean enabledMetrics, boolean enabledTraces, boolean enabledLogs, Map<String, String> frameworkOptions) {
        super();
        this.name = name;
        this.existing = existing;
        this.enabledMetrics = enabledMetrics;
        this.enabledTraces = enabledTraces;
        this.enabledLogs = enabledLogs;
        this.frameworkOptions = frameworkOptions;
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
        sb.append(InstrumentationFrameworkDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("existing");
        sb.append('=');
        sb.append(this.existing);
        sb.append(',');
        sb.append("enabledMetrics");
        sb.append('=');
        sb.append(this.enabledMetrics);
        sb.append(',');
        sb.append("enabledTraces");
        sb.append('=');
        sb.append(this.enabledTraces);
        sb.append(',');
        sb.append("enabledLogs");
        sb.append('=');
        sb.append(this.enabledLogs);
        sb.append(',');
        sb.append("frameworkOptions");
        sb.append('=');
        sb.append(((this.frameworkOptions == null)?"<null>":this.frameworkOptions));
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
        result = ((result* 31)+(this.existing? 1 : 0));
        result = ((result* 31)+(this.enabledTraces? 1 : 0));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+(this.enabledMetrics? 1 : 0));
        result = ((result* 31)+(this.enabledLogs? 1 : 0));
        result = ((result* 31)+((this.frameworkOptions == null)? 0 :this.frameworkOptions.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstrumentationFrameworkDescription) == false) {
            return false;
        }
        InstrumentationFrameworkDescription rhs = ((InstrumentationFrameworkDescription) other);
        return (((((((this.existing == rhs.existing)&&(this.enabledTraces == rhs.enabledTraces))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&(this.enabledMetrics == rhs.enabledMetrics))&&(this.enabledLogs == rhs.enabledLogs))&&((this.frameworkOptions == rhs.frameworkOptions)||((this.frameworkOptions!= null)&&this.frameworkOptions.equals(rhs.frameworkOptions))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
