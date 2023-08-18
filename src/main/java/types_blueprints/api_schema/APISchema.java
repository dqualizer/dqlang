
package types_blueprints.api_schema;

import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * API Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "context",
    "api",
    "server_info",
    "field",
    "data_schemas"
})
@Generated("jsonschema2pojo")
public class APISchema {

    /**
     * Version of this schema representation
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of this schema representation")
    @NotNull
    @Nonnull
    public int version;
    /**
     * The name of the Bounded Context to which this schema belongs
     * (Required)
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The name of the Bounded Context to which this schema belongs")
    @Size(min = 1)
    @NotNull
    @Nonnull
    public String context;
    /**
     * Used API Schema of the Bounded Context
     * (Required)
     * 
     */
    @JsonProperty("api")
    @JsonPropertyDescription("Used API Schema of the Bounded Context")
    @Size(min = 1)
    @NotNull
    @Nonnull
    public String api;
    /**
     * Collection of different URls of this Bounded Context
     * (Required)
     * 
     */
    @JsonProperty("server_info")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Collection of different URls of this Bounded Context")
    @Valid
    @NotNull
    @Nonnull
    public Set<ServerInfo> serverInfo = new LinkedHashSet<ServerInfo>();
    /**
     * Information about all endpoints of this Bounded Context
     * (Required)
     * 
     */
    @JsonProperty("field")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Information about all endpoints of this Bounded Context")
    @Valid
    @NotNull
    @Nonnull
    public Set<Object> field = new LinkedHashSet<Object>();
    /**
     * Data schemas of all used data types in this API schema
     * (Required)
     * 
     */
    @JsonProperty("data_schemas")
    @JsonPropertyDescription("Data schemas of all used data types in this API schema")
    @Valid
    @NotNull
    @Nonnull
    public DataSchemas dataSchemas;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public APISchema() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public APISchema(APISchema source) {
        super();
        this.version = source.version;
        this.context = source.context;
        this.api = source.api;
        this.serverInfo = source.serverInfo;
        this.field = source.field;
        this.dataSchemas = source.dataSchemas;
    }

    /**
     * 
     * @param serverInfo
     *     Collection of different URls of this Bounded Context.
     * @param field
     *     Information about all endpoints of this Bounded Context.
     * @param dataSchemas
     *     Data schemas of all used data types in this API schema.
     * @param context
     *     The name of the Bounded Context to which this schema belongs.
     * @param api
     *     Used API Schema of the Bounded Context.
     * @param version
     *     Version of this schema representation.
     */
    @ConstructorProperties({
        "version",
        "context",
        "api",
        "serverInfo",
        "field",
        "dataSchemas"
    })
    public APISchema(int version, String context, String api, Set<ServerInfo> serverInfo, Set<Object> field, DataSchemas dataSchemas) {
        super();
        this.version = version;
        this.context = context;
        this.api = api;
        this.serverInfo = serverInfo;
        this.field = field;
        this.dataSchemas = dataSchemas;
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
        sb.append(APISchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("version");
        sb.append('=');
        sb.append(this.version);
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("api");
        sb.append('=');
        sb.append(((this.api == null)?"<null>":this.api));
        sb.append(',');
        sb.append("serverInfo");
        sb.append('=');
        sb.append(((this.serverInfo == null)?"<null>":this.serverInfo));
        sb.append(',');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("dataSchemas");
        sb.append('=');
        sb.append(((this.dataSchemas == null)?"<null>":this.dataSchemas));
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
        result = ((result* 31)+((this.serverInfo == null)? 0 :this.serverInfo.hashCode()));
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.dataSchemas == null)? 0 :this.dataSchemas.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.api == null)? 0 :this.api.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+ this.version);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof APISchema) == false) {
            return false;
        }
        APISchema rhs = ((APISchema) other);
        return ((((((((this.serverInfo == rhs.serverInfo)||((this.serverInfo!= null)&&this.serverInfo.equals(rhs.serverInfo)))&&((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field))))&&((this.dataSchemas == rhs.dataSchemas)||((this.dataSchemas!= null)&&this.dataSchemas.equals(rhs.dataSchemas))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.api == rhs.api)||((this.api!= null)&&this.api.equals(rhs.api))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(this.version == rhs.version));
    }

}
