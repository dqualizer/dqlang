package io.github.dqualizer.dqlang.types.api_schema;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "host",
        "environment"
})
@Generated("jsonschema2pojo")
public class ServerInfo {

    /**
     * URL of the host, also logical URLs (Required)
     */
    @JsonProperty("host")
    @JsonPropertyDescription("URL of the host, also logical URLs")

    public String host;
    /**
     * The environment this host belongs to (Required)
     */
    @JsonProperty("environment")
    @JsonPropertyDescription("The environment this host belongs to")

    public String environment;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public ServerInfo() {
    }

    /**
     * @param source the object being copied
     */
    public ServerInfo(ServerInfo source) {
        super();
        this.host = source.host;
        this.environment = source.environment;
    }

    /**
     * @param environment The environment this host belongs to.
     * @param host        URL of the host, also logical URLs.
     */
    @ConstructorProperties({
            "host",
            "environment"
    })
    public ServerInfo(String host, String environment) {
        super();
        this.host = host;
        this.environment = environment;
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
        sb.append(ServerInfo.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null) ? "<null>" : this.host));
        sb.append(',');
        sb.append("environment");
        sb.append('=');
        sb.append(((this.environment == null) ? "<null>" : this.environment));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.host == null) ? 0 : this.host.hashCode()));
        result = ((result * 31) + ((this.environment == null) ? 0 : this.environment.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServerInfo) == false) {
            return false;
        }
        ServerInfo rhs = ((ServerInfo) other);
        return ((((this.host == rhs.host) || ((this.host != null) && this.host.equals(rhs.host))) && ((this.environment == rhs.environment) || ((this.environment != null) && this.environment.equals(
                rhs.environment)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(
                rhs.additionalProperties))));
    }

}
