
package dqualizer.dqlang.types.rqa_definition;

import java.beans.ConstructorProperties;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * References to data sources for parametrization
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "path_variables",
    "url_parameter",
    "request_parameter",
    "payload"
})
@Generated("jsonschema2pojo")
public class Parametrization {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("path_variables")
    @Valid
    @NotNull
    @Nonnull
    public PathVariables pathVariables;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url_parameter")
    @Valid
    @NotNull
    @Nonnull
    public UrlParameter urlParameter;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("request_parameter")
    @Valid
    @NotNull
    @Nonnull
    public RequestParameter requestParameter;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payload")
    @Valid
    @NotNull
    @Nonnull
    public Payload payload;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parametrization() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public Parametrization(Parametrization source) {
        super();
        this.pathVariables = source.pathVariables;
        this.urlParameter = source.urlParameter;
        this.requestParameter = source.requestParameter;
        this.payload = source.payload;
    }

    @ConstructorProperties({
        "pathVariables",
        "urlParameter",
        "requestParameter",
        "payload"
    })
    public Parametrization(PathVariables pathVariables, UrlParameter urlParameter, RequestParameter requestParameter, Payload payload) {
        super();
        this.pathVariables = pathVariables;
        this.urlParameter = urlParameter;
        this.requestParameter = requestParameter;
        this.payload = payload;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Parametrization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.payload == null)? 0 :this.payload.hashCode()));
        result = ((result* 31)+((this.urlParameter == null)? 0 :this.urlParameter.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parametrization) == false) {
            return false;
        }
        Parametrization rhs = ((Parametrization) other);
        return (((((this.requestParameter == rhs.requestParameter)||((this.requestParameter!= null)&&this.requestParameter.equals(rhs.requestParameter)))&&((this.pathVariables == rhs.pathVariables)||((this.pathVariables!= null)&&this.pathVariables.equals(rhs.pathVariables))))&&((this.payload == rhs.payload)||((this.payload!= null)&&this.payload.equals(rhs.payload))))&&((this.urlParameter == rhs.urlParameter)||((this.urlParameter!= null)&&this.urlParameter.equals(rhs.urlParameter))));
    }

}
