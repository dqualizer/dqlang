
package types_blueprints.adapter.k6;

import java.beans.ConstructorProperties;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Request
 * <p>
 * Information for the k6 'default function()' that will send requests to one endpoint
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "path",
    "path_variables",
    "query_params",
    "params",
    "payload",
    "checks"
})
@Generated("jsonschema2pojo")
public class Request {

    /**
     * Type of HTTP-method
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of HTTP-method")
    @NotNull
    @Nonnull
    public Request.Type type;
    /**
     * Path of this endpoint
     * (Required)
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Path of this endpoint")
    @NotNull
    @Nonnull
    public String path;
    /**
     * References to data sources that can be used for url parameters, like Ids, for this method
     * (Required)
     * 
     */
    @JsonProperty("path_variables")
    @JsonPropertyDescription("References to data sources that can be used for url parameters, like Ids, for this method")
    @Valid
    @NotNull
    @Nonnull
    public PathVariables pathVariables;
    /**
     * References to data sources that can be used for url parameters for this method
     * (Required)
     * 
     */
    @JsonProperty("query_params")
    @JsonPropertyDescription("References to data sources that can be used for url parameters for this method")
    @Valid
    @NotNull
    @Nonnull
    public QueryParams queryParams;
    /**
     * References to data sources that can be used for request parameters, like headers or cookies, for this method
     * (Required)
     * 
     */
    @JsonProperty("params")
    @JsonPropertyDescription("References to data sources that can be used for request parameters, like headers or cookies, for this method")
    @Valid
    @NotNull
    @Nonnull
    public Params params;
    /**
     * References to data sources that can be used for payload bodies for this method
     * (Required)
     * 
     */
    @JsonProperty("payload")
    @JsonPropertyDescription("References to data sources that can be used for payload bodies for this method")
    @Valid
    @NotNull
    @Nonnull
    public Payload payload;
    /**
     * Values that should be checked by k6
     * (Required)
     * 
     */
    @JsonProperty("checks")
    @JsonPropertyDescription("Values that should be checked by k6")
    @Valid
    @NotNull
    @Nonnull
    public Checks checks;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Request() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public Request(Request source) {
        super();
        this.type = source.type;
        this.path = source.path;
        this.pathVariables = source.pathVariables;
        this.queryParams = source.queryParams;
        this.params = source.params;
        this.payload = source.payload;
        this.checks = source.checks;
    }

    /**
     * 
     * @param path
     *     Path of this endpoint.
     * @param pathVariables
     *     References to data sources that can be used for url parameters, like Ids, for this method.
     * @param checks
     *     Values that should be checked by k6.
     * @param queryParams
     *     References to data sources that can be used for url parameters for this method.
     * @param payload
     *     References to data sources that can be used for payload bodies for this method.
     * @param type
     *     Type of HTTP-method.
     * @param params
     *     References to data sources that can be used for request parameters, like headers or cookies, for this method.
     */
    @ConstructorProperties({
        "type",
        "path",
        "pathVariables",
        "queryParams",
        "params",
        "payload",
        "checks"
    })
    public Request(Request.Type type, String path, PathVariables pathVariables, QueryParams queryParams, Params params, Payload payload, Checks checks) {
        super();
        this.type = type;
        this.path = path;
        this.pathVariables = pathVariables;
        this.queryParams = queryParams;
        this.params = params;
        this.payload = payload;
        this.checks = checks;
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
        sb.append(Request.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null)?"<null>":this.path));
        sb.append(',');
        sb.append("pathVariables");
        sb.append('=');
        sb.append(((this.pathVariables == null)?"<null>":this.pathVariables));
        sb.append(',');
        sb.append("queryParams");
        sb.append('=');
        sb.append(((this.queryParams == null)?"<null>":this.queryParams));
        sb.append(',');
        sb.append("params");
        sb.append('=');
        sb.append(((this.params == null)?"<null>":this.params));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        sb.append("checks");
        sb.append('=');
        sb.append(((this.checks == null)?"<null>":this.checks));
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
        result = ((result* 31)+((this.path == null)? 0 :this.path.hashCode()));
        result = ((result* 31)+((this.pathVariables == null)? 0 :this.pathVariables.hashCode()));
        result = ((result* 31)+((this.checks == null)? 0 :this.checks.hashCode()));
        result = ((result* 31)+((this.queryParams == null)? 0 :this.queryParams.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.params == null)? 0 :this.params.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Request) == false) {
            return false;
        }
        Request rhs = ((Request) other);
        return (((((((((this.path == rhs.path)||((this.path!= null)&&this.path.equals(rhs.path)))&&((this.pathVariables == rhs.pathVariables)||((this.pathVariables!= null)&&this.pathVariables.equals(rhs.pathVariables))))&&((this.checks == rhs.checks)||((this.checks!= null)&&this.checks.equals(rhs.checks))))&&((this.queryParams == rhs.queryParams)||((this.queryParams!= null)&&this.queryParams.equals(rhs.queryParams))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.params == rhs.params)||((this.params!= null)&&this.params.equals(rhs.params))));
    }


    /**
     * Type of HTTP-method
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        GET("GET"),
        POST("POST"),
        PUT("PUT"),
        DELETE("DELETE");
        private final String value;
        private final static Map<String, Request.Type> CONSTANTS = new HashMap<String, Request.Type>();

        static {
            for (Request.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Request.Type fromValue(String value) {
            Request.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
