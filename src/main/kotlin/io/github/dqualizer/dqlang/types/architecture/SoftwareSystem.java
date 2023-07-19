
package io.github.dqualizer.dqlang.types.architecture;

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
 * SoftwareSystem
 * <p>
 * A generic description of a software system.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "services",
    "runtime_platforms"
})
@Generated("jsonschema2pojo")
public class SoftwareSystem {

    /**
     * The name of the software system.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the software system.")
    @NotNull
    public String name;
    /**
     * The services that the software system provides.
     * (Required)
     * 
     */
    @JsonProperty("services")
    @JsonPropertyDescription("The services that the software system provides.")
    @Valid
    @NotNull
    public List<ServiceDescription> services = new ArrayList<ServiceDescription>();
    /**
     * The runtime platforms that the various parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("runtime_platforms")
    @JsonPropertyDescription("The runtime platforms that the various parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.")
    @Valid
    public List<RuntimePlatform> runtimePlatforms = new ArrayList<RuntimePlatform>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SoftwareSystem() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public SoftwareSystem(SoftwareSystem source) {
        super();
        this.name = source.name;
        this.services = source.services;
        this.runtimePlatforms = source.runtimePlatforms;
    }

    /**
     * 
     * @param name
     *     The name of the software system.
     * @param runtimePlatforms
     *     The runtime platforms that the various parts of the software system run on. An empty array should indicate that the software system runs on a local runtime platform.
     * @param services
     *     The services that the software system provides.
     */
    @ConstructorProperties({
        "name",
        "services",
        "runtimePlatforms"
    })
    public SoftwareSystem(String name, List<ServiceDescription> services, List<RuntimePlatform> runtimePlatforms) {
        super();
        this.name = name;
        this.services = services;
        this.runtimePlatforms = runtimePlatforms;
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
        sb.append(SoftwareSystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("services");
        sb.append('=');
        sb.append(((this.services == null)?"<null>":this.services));
        sb.append(',');
        sb.append("runtimePlatforms");
        sb.append('=');
        sb.append(((this.runtimePlatforms == null)?"<null>":this.runtimePlatforms));
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
        result = ((result* 31)+((this.runtimePlatforms == null)? 0 :this.runtimePlatforms.hashCode()));
        result = ((result* 31)+((this.services == null)? 0 :this.services.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SoftwareSystem) == false) {
            return false;
        }
        SoftwareSystem rhs = ((SoftwareSystem) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.runtimePlatforms == rhs.runtimePlatforms)||((this.runtimePlatforms!= null)&&this.runtimePlatforms.equals(rhs.runtimePlatforms))))&&((this.services == rhs.services)||((this.services!= null)&&this.services.equals(rhs.services))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
