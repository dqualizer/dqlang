
package dqualizer.dqlang.types.load_test_configuration;

import java.beans.ConstructorProperties;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "field",
    "operation",
    "path_variables",
    "url_parameter",
    "request_parameter",
    "payload",
    "responses"
})
@Generated("jsonschema2pojo")
public class Endpoint {

    /**
     * Location of this endpoint
     * (Required)
     * 
     */
    @JsonProperty("field")
    @JsonPropertyDescription("Location of this endpoint")
    @NotNull
    @Nonnull
    public String field;
    /**
     * Operation of this object
     * (Required)
     * 
     */
    @JsonProperty("operation")
    @JsonPropertyDescription("Operation of this object")
    @NotNull
    @Nonnull
    public String operation;
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
     * References to data sources that can be used for request parameters, like headers or cookies, for this method
     * (Required)
     * 
     */
    @JsonProperty("url_parameter")
    @JsonPropertyDescription("References to data sources that can be used for request parameters, like headers or cookies, for this method")
    @Valid
    @NotNull
    @Nonnull
    public UrlParameter urlParameter;
    /**
     * References to data sources that can be used for request parameters, like headers or cookies, for this method
     * (Required)
     * 
     */
    @JsonProperty("request_parameter")
    @JsonPropertyDescription("References to data sources that can be used for request parameters, like headers or cookies, for this method")
    @Valid
    @NotNull
    @Nonnull
    public RequestParameter requestParameter;
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
     * Anything, that this endpoints returns
     * (Required)
     * 
     */
    @JsonProperty("responses")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Anything, that this endpoints returns")
    @Valid
    @NotNull
    @Nonnull
    public Set<Response> responses = new LinkedHashSet<Response>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Endpoint() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public Endpoint(Endpoint source) {
        super();
        this.field = source.field;
        this.operation = source.operation;
        this.pathVariables = source.pathVariables;
        this.urlParameter = source.urlParameter;
        this.requestParameter = source.requestParameter;
        this.payload = source.payload;
        this.responses = source.responses;
    }

    /**
     * 
     * @param requestParameter
     *     References to data sources that can be used for request parameters, like headers or cookies, for this method.
     * @param pathVariables
     *     References to data sources that can be used for url parameters, like Ids, for this method.
     * @param field
     *     Location of this endpoint.
     * @param payload
     *     References to data sources that can be used for payload bodies for this method.
     * @param responses
     *     Anything, that this endpoints returns.
     * @param operation
     *     Operation of this object.
     * @param urlParameter
     *     References to data sources that can be used for request parameters, like headers or cookies, for this method.
     */
    @ConstructorProperties({
        "field",
        "operation",
        "pathVariables",
        "urlParameter",
        "requestParameter",
        "payload",
        "responses"
    })
    public Endpoint(String field, String operation, PathVariables pathVariables, UrlParameter urlParameter, RequestParameter requestParameter, Payload payload, Set<Response> responses) {
        super();
        this.field = field;
        this.operation = operation;
        this.pathVariables = pathVariables;
        this.urlParameter = urlParameter;
        this.requestParameter = requestParameter;
        this.payload = payload;
        this.responses = responses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Endpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("operation");
        sb.append('=');
        sb.append(((this.operation == null)?"<null>":this.operation));
        sb.append(',');
        sb.append("pathVariables");
        sb.append('=');
        sb.append(((this.pathVariables == null)?"<null>":this.pathVariables));
        sb.append(',');
        sb.append("urlParameter");
        sb.append('=');
        sb.append(((this.urlParameter == null)?"<null>":this.urlParameter));
        sb.append(',');
        sb.append("requestParameter");
        sb.append('=');
        sb.append(((this.requestParameter == null)?"<null>":this.requestParameter));
        sb.append(',');
        sb.append("payload");
        sb.append('=');
        sb.append(((this.payload == null)?"<null>":this.payload));
        sb.append(',');
        sb.append("responses");
        sb.append('=');
        sb.append(((this.responses == null)?"<null>":this.responses));
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
        result = ((result* 31)+((this.requestParameter == null)? 0 :this.requestParameter.hashCode()));
        result = ((result* 31)+((this.pathVariables == null)? 0 :this.pathVariables.hashCode()));
        result = ((result* 31)+((this.field == null)? 0 :this.field.hashCode()));
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.responses == null)? 0 :this.responses.hashCode()));
        result = ((result* 31)+((this.operation == null)? 0 :this.operation.hashCode()));
        result = ((result* 31)+((this.urlParameter == null)? 0 :this.urlParameter.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endpoint) == false) {
            return false;
        }
        Endpoint rhs = ((Endpoint) other);
        return ((((((((this.requestParameter == rhs.requestParameter)||((this.requestParameter!= null)&&this.requestParameter.equals(rhs.requestParameter)))&&((this.pathVariables == rhs.pathVariables)||((this.pathVariables!= null)&&this.pathVariables.equals(rhs.pathVariables))))&&((this.field == rhs.field)||((this.field!= null)&&this.field.equals(rhs.field))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this.responses == rhs.responses)||((this.responses!= null)&&this.responses.equals(rhs.responses))))&&((this.operation == rhs.operation)||((this.operation!= null)&&this.operation.equals(rhs.operation))))&&((this.urlParameter == rhs.urlParameter)||((this.urlParameter!= null)&&this.urlParameter.equals(rhs.urlParameter))));
    }

}
