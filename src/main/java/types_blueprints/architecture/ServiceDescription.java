
package types_blueprints.architecture;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
 * Service Description
 * <p>
 * A generic description of a service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "deployment_name",
    "URI",
    "service_framework",
    "instrumentation_framework",
    "instruments",
    "runtime_platform_id"
})
@Generated("jsonschema2pojo")
public class ServiceDescription {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @NotNull
    @Nonnull
    public String name;
    /**
     * Name under which the service is deployed. e.g. the name of the docker container. Can be empty then the name is used.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("deployment_name")
    @JsonPropertyDescription("Name under which the service is deployed. e.g. the name of the docker container. Can be empty then the name is used.")
    public String deploymentName;
    /**
     * Route to access the service. e.g. via ssh
     * (Required)
     * 
     */
    @JsonProperty("URI")
    @JsonPropertyDescription("Route to access the service. e.g. via ssh")
    @NotNull
    @Nonnull
    public String uri;
    /**
     * Framework used to run the service.
     * (Required)
     * 
     */
    @JsonProperty("service_framework")
    @JsonPropertyDescription("Framework used to run the service.")
    @NotNull
    @Nonnull
    public String serviceFramework;
    /**
     * InstrumentationFrameworkDescription
     * <p>
     * A generic description of an instrumentation framework. 
     * (Required)
     * 
     */
    @JsonProperty("instrumentation_framework")
    @JsonPropertyDescription("A generic description of an instrumentation framework. ")
    @Valid
    @NotNull
    @Nonnull
    public InstrumentationFrameworkDescription instrumentationFramework;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("instruments")
    @Valid
    @NotNull
    @Nonnull
    public List<Instrument> instruments = new ArrayList<Instrument>();
    /**
     * The id of the runtime platform that the service is running on. May be empty if its run locally.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("runtime_platform_id")
    @JsonPropertyDescription("The id of the runtime platform that the service is running on. May be empty if its run locally.")
    public String runtimePlatformId;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceDescription() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public ServiceDescription(ServiceDescription source) {
        super();
        this.name = source.name;
        this.deploymentName = source.deploymentName;
        this.uri = source.uri;
        this.serviceFramework = source.serviceFramework;
        this.instrumentationFramework = source.instrumentationFramework;
        this.instruments = source.instruments;
        this.runtimePlatformId = source.runtimePlatformId;
    }

    /**
     * 
     * @param serviceFramework
     *     Framework used to run the service.
     * @param deploymentName
     *     Name under which the service is deployed. e.g. the name of the docker container. Can be empty then the name is used.
     * @param uri
     *     Route to access the service. e.g. via ssh.
     * @param runtimePlatformId
     *     The id of the runtime platform that the service is running on. May be empty if its run locally.
     */
    @ConstructorProperties({
        "name",
        "deploymentName",
        "uri",
        "serviceFramework",
        "instrumentationFramework",
        "instruments",
        "runtimePlatformId"
    })
    public ServiceDescription(String name, String deploymentName, String uri, String serviceFramework, InstrumentationFrameworkDescription instrumentationFramework, List<Instrument> instruments, String runtimePlatformId) {
        super();
        this.name = name;
        this.deploymentName = deploymentName;
        this.uri = uri;
        this.serviceFramework = serviceFramework;
        this.instrumentationFramework = instrumentationFramework;
        this.instruments = instruments;
        this.runtimePlatformId = runtimePlatformId;
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
        sb.append(ServiceDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("deploymentName");
        sb.append('=');
        sb.append(((this.deploymentName == null)?"<null>":this.deploymentName));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
        sb.append(',');
        sb.append("serviceFramework");
        sb.append('=');
        sb.append(((this.serviceFramework == null)?"<null>":this.serviceFramework));
        sb.append(',');
        sb.append("instrumentationFramework");
        sb.append('=');
        sb.append(((this.instrumentationFramework == null)?"<null>":this.instrumentationFramework));
        sb.append(',');
        sb.append("instruments");
        sb.append('=');
        sb.append(((this.instruments == null)?"<null>":this.instruments));
        sb.append(',');
        sb.append("runtimePlatformId");
        sb.append('=');
        sb.append(((this.runtimePlatformId == null)?"<null>":this.runtimePlatformId));
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
        result = ((result* 31)+((this.serviceFramework == null)? 0 :this.serviceFramework.hashCode()));
        result = ((result* 31)+((this.instruments == null)? 0 :this.instruments.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.deploymentName == null)? 0 :this.deploymentName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        result = ((result* 31)+((this.instrumentationFramework == null)? 0 :this.instrumentationFramework.hashCode()));
        result = ((result* 31)+((this.runtimePlatformId == null)? 0 :this.runtimePlatformId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceDescription) == false) {
            return false;
        }
        ServiceDescription rhs = ((ServiceDescription) other);
        return (((((((((this.serviceFramework == rhs.serviceFramework)||((this.serviceFramework!= null)&&this.serviceFramework.equals(rhs.serviceFramework)))&&((this.instruments == rhs.instruments)||((this.instruments!= null)&&this.instruments.equals(rhs.instruments))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.deploymentName == rhs.deploymentName)||((this.deploymentName!= null)&&this.deploymentName.equals(rhs.deploymentName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri))))&&((this.instrumentationFramework == rhs.instrumentationFramework)||((this.instrumentationFramework!= null)&&this.instrumentationFramework.equals(rhs.instrumentationFramework))))&&((this.runtimePlatformId == rhs.runtimePlatformId)||((this.runtimePlatformId!= null)&&this.runtimePlatformId.equals(rhs.runtimePlatformId))));
    }

}
