
package types_blueprints.rqa_definition;

import java.beans.ConstructorProperties;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    "name",
    "artifact",
    "description",
    "stimulus",
    "parametrization",
    "response_measure",
    "result_metrics"
})
@Generated("jsonschema2pojo")
public class Loadtest {

    /**
     * An identifier for a Loadtest.
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("name")
    @JsonPropertyDescription("An identifier for a Loadtest.")
    public String name;
    /**
     * 
     * (Required)
     * 
     */
    @Nullable
    @JsonProperty("artifact")
    @Valid
    @NotNull
    @Nonnull
    public Artifact artifact;
    /**
     * Description of this loadtest
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("description")
    @JsonPropertyDescription("Description of this loadtest")
    public String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stimulus")
    @NotNull
    @Nonnull
    public Object stimulus;
    /**
     * References to data sources for parametrization
     * (Required)
     * 
     */
    @Nullable
    @JsonProperty("parametrization")
    @JsonPropertyDescription("References to data sources for parametrization")
    @Valid
    @NotNull
    @Nonnull
    public Parametrization parametrization;
    /**
     * 
     * (Required)
     * 
     */
    @Nullable
    @JsonProperty("response_measure")
    @Valid
    @NotNull
    @Nonnull
    public ResponseMeasure responseMeasure;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result_metrics")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    @NotNull
    @Nonnull
    public Set<String> resultMetrics = new LinkedHashSet<String>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Loadtest() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public Loadtest(Loadtest source) {
        super();
        this.name = source.name;
        this.artifact = source.artifact;
        this.description = source.description;
        this.stimulus = source.stimulus;
        this.parametrization = source.parametrization;
        this.responseMeasure = source.responseMeasure;
        this.resultMetrics = source.resultMetrics;
    }

    /**
     * 
     * @param parametrization
     *     References to data sources for parametrization.
     * @param name
     *     An identifier for a Loadtest.
     * @param description
     *     Description of this loadtest.
     */
    @ConstructorProperties({
        "name",
        "artifact",
        "description",
        "stimulus",
        "parametrization",
        "responseMeasure",
        "resultMetrics"
    })
    public Loadtest(String name, Artifact artifact, String description, Object stimulus, Parametrization parametrization, ResponseMeasure responseMeasure, Set<String> resultMetrics) {
        super();
        this.name = name;
        this.artifact = artifact;
        this.description = description;
        this.stimulus = stimulus;
        this.parametrization = parametrization;
        this.responseMeasure = responseMeasure;
        this.resultMetrics = resultMetrics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Loadtest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("artifact");
        sb.append('=');
        sb.append(((this.artifact == null)?"<null>":this.artifact));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("stimulus");
        sb.append('=');
        sb.append(((this.stimulus == null)?"<null>":this.stimulus));
        sb.append(',');
        sb.append("parametrization");
        sb.append('=');
        sb.append(((this.parametrization == null)?"<null>":this.parametrization));
        sb.append(',');
        sb.append("responseMeasure");
        sb.append('=');
        sb.append(((this.responseMeasure == null)?"<null>":this.responseMeasure));
        sb.append(',');
        sb.append("resultMetrics");
        sb.append('=');
        sb.append(((this.resultMetrics == null)?"<null>":this.resultMetrics));
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
        result = ((result* 31)+((this.artifact == null)? 0 :this.artifact.hashCode()));
        result = ((result* 31)+((this.responseMeasure == null)? 0 :this.responseMeasure.hashCode()));
        result = ((result* 31)+((this.resultMetrics == null)? 0 :this.resultMetrics.hashCode()));
        result = ((result* 31)+((this.parametrization == null)? 0 :this.parametrization.hashCode()));
        result = ((result* 31)+((this.stimulus == null)? 0 :this.stimulus.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Loadtest) == false) {
            return false;
        }
        Loadtest rhs = ((Loadtest) other);
        return ((((((((this.artifact == rhs.artifact)||((this.artifact!= null)&&this.artifact.equals(rhs.artifact)))&&((this.responseMeasure == rhs.responseMeasure)||((this.responseMeasure!= null)&&this.responseMeasure.equals(rhs.responseMeasure))))&&((this.resultMetrics == rhs.resultMetrics)||((this.resultMetrics!= null)&&this.resultMetrics.equals(rhs.resultMetrics))))&&((this.parametrization == rhs.parametrization)||((this.parametrization!= null)&&this.parametrization.equals(rhs.parametrization))))&&((this.stimulus == rhs.stimulus)||((this.stimulus!= null)&&this.stimulus.equals(rhs.stimulus))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))));
    }

}
