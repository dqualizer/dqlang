package io.github.dqualizer.dqlang.types.domain_architecture_mapping;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.beans.ConstructorProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "host",
        "environment"
})
@Generated("jsonschema2pojo")
public class ServerInfo {

    /**
     * URL of this host, also logical URLs (Required)
     */
    @JsonProperty("host")
    @JsonPropertyDescription("URL of this host, also logical URLs")

    public String host;
    /**
     * The environment this host belongs to (Required)
     */
    @JsonProperty("environment")
    @JsonPropertyDescription("The environment this host belongs to")

    public String environment;

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
     * @param host        URL of this host, also logical URLs.
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
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServerInfo) == false) {
            return false;
        }
        ServerInfo rhs = ((ServerInfo) other);
        return (((this.host == rhs.host) || ((this.host != null) && this.host.equals(rhs.host))) && ((this.environment == rhs.environment) || ((this.environment != null) && this.environment.equals(
                rhs.environment))));
    }

}
