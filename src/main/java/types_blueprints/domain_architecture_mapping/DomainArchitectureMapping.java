
package dqualizer.dqlang.types.domain_architecture_mapping;

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
 * Domain Architecture Mapping
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "context",
    "server_info",
    "objects"
})
@Generated("jsonschema2pojo")
public class DomainArchitectureMapping {

    /**
     * Version of this mapping representation
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of this mapping representation")
    @NotNull
    @Nonnull
    public int version;
    /**
     * The name of the Bounded Context to which this mapping belongs
     * (Required)
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The name of the Bounded Context to which this mapping belongs")
    @Size(min = 1)
    @NotNull
    @Nonnull
    public String context;
    /**
     * List of different hosts
     * (Required)
     * 
     */
    @JsonProperty("server_info")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of different hosts")
    @Valid
    @NotNull
    @Nonnull
    public Set<ServerInfo> serverInfo = new LinkedHashSet<ServerInfo>();
    /**
     * List of technical entities that represent Work Objects and Actors from Domain Stories
     * (Required)
     * 
     */
    @JsonProperty("objects")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of technical entities that represent Work Objects and Actors from Domain Stories")
    @Valid
    @NotNull
    @Nonnull
    public Set<dqualizer.dqlang.types.domain_architecture_mapping.Object> objects = new LinkedHashSet<dqualizer.dqlang.types.domain_architecture_mapping.Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DomainArchitectureMapping() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public DomainArchitectureMapping(DomainArchitectureMapping source) {
        super();
        this.version = source.version;
        this.context = source.context;
        this.serverInfo = source.serverInfo;
        this.objects = source.objects;
    }

    /**
     * 
     * @param serverInfo
     *     List of different hosts.
     * @param objects
     *     List of technical entities that represent Work Objects and Actors from Domain Stories.
     * @param context
     *     The name of the Bounded Context to which this mapping belongs.
     * @param version
     *     Version of this mapping representation.
     */
    @ConstructorProperties({
        "version",
        "context",
        "serverInfo",
        "objects"
    })
    public DomainArchitectureMapping(int version, String context, Set<ServerInfo> serverInfo, Set<dqualizer.dqlang.types.domain_architecture_mapping.Object> objects) {
        super();
        this.version = version;
        this.context = context;
        this.serverInfo = serverInfo;
        this.objects = objects;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomainArchitectureMapping.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(this.version);
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("serverInfo");
        sb.append('=');
        sb.append(((this.serverInfo == null)?"<null>":this.serverInfo));
        sb.append(',');
        sb.append("objects");
        sb.append('=');
        sb.append(((this.objects == null)?"<null>":this.objects));
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
        result = ((result* 31)+((this.serverInfo == null)? 0 :this.serverInfo.hashCode()));
        result = ((result* 31)+ this.version);
        result = ((result* 31)+((this.objects == null)? 0 :this.objects.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainArchitectureMapping) == false) {
            return false;
        }
        DomainArchitectureMapping rhs = ((DomainArchitectureMapping) other);
        return (((((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context)))&&((this.serverInfo == rhs.serverInfo)||((this.serverInfo!= null)&&this.serverInfo.equals(rhs.serverInfo))))&&(this.version == rhs.version))&&((this.objects == rhs.objects)||((this.objects!= null)&&this.objects.equals(rhs.objects))));
    }

}
