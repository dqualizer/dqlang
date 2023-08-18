
package types_blueprints.architecture;

import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
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
 * Runtime Platform
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "platform_id",
    "platform_name",
    "platform_uri"
})
@Generated("jsonschema2pojo")
public class RuntimePlatform {

    /**
     * Identifier of a platform instance on which a service is running on. This indicator is needed when multiple instances of the same platform are used.
     * (Required)
     * 
     */
    @JsonProperty("platform_id")
    @JsonPropertyDescription("Identifier of a platform instance on which a service is running on. This indicator is needed when multiple instances of the same platform are used.")
    @NotNull
    @Nonnull
    public String platformId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform_name")
    @NotNull
    @Nonnull
    public String platformName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("platform_uri")
    @NotNull
    @Nonnull
    public String platformUri;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RuntimePlatform() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public RuntimePlatform(RuntimePlatform source) {
        super();
        this.platformId = source.platformId;
        this.platformName = source.platformName;
        this.platformUri = source.platformUri;
    }

    /**
     * 
     * @param platformId
     *     Identifier of a platform instance on which a service is running on. This indicator is needed when multiple instances of the same platform are used.
     */
    @ConstructorProperties({
        "platformId",
        "platformName",
        "platformUri"
    })
    public RuntimePlatform(String platformId, String platformName, String platformUri) {
        super();
        this.platformId = platformId;
        this.platformName = platformName;
        this.platformUri = platformUri;
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
        sb.append(RuntimePlatform.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("platformId");
        sb.append('=');
        sb.append(((this.platformId == null)?"<null>":this.platformId));
        sb.append(',');
        sb.append("platformName");
        sb.append('=');
        sb.append(((this.platformName == null)?"<null>":this.platformName));
        sb.append(',');
        sb.append("platformUri");
        sb.append('=');
        sb.append(((this.platformUri == null)?"<null>":this.platformUri));
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
        result = ((result* 31)+((this.platformId == null)? 0 :this.platformId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.platformName == null)? 0 :this.platformName.hashCode()));
        result = ((result* 31)+((this.platformUri == null)? 0 :this.platformUri.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuntimePlatform) == false) {
            return false;
        }
        RuntimePlatform rhs = ((RuntimePlatform) other);
        return (((((this.platformId == rhs.platformId)||((this.platformId!= null)&&this.platformId.equals(rhs.platformId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.platformName == rhs.platformName)||((this.platformName!= null)&&this.platformName.equals(rhs.platformName))))&&((this.platformUri == rhs.platformUri)||((this.platformUri!= null)&&this.platformUri.equals(rhs.platformUri))));
    }

}
