
package types_blueprints.rqa_definition;

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
    "monitoring",
    "resilience",
    "loadtests"
})
@Generated("jsonschema2pojo")
public class RuntimeQualityAnalysis {

    /**
     * Configurations for specified monitoring
     * (Required)
     * 
     */
    @JsonProperty("monitoring")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Configurations for specified monitoring")
    @Valid
    @NotNull
    @Nonnull
    public Set<Monitoring> monitoring = new LinkedHashSet<Monitoring>();
    /**
     * Configurations for specified resilience tests
     * (Required)
     * 
     */
    @JsonProperty("resilience")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Configurations for specified resilience tests")
    @Valid
    @NotNull
    @Nonnull
    public Set<Resilience> resilience = new LinkedHashSet<Resilience>();
    /**
     * Configurations for specified load tests
     * (Required)
     * 
     */
    @JsonProperty("loadtests")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Configurations for specified load tests")
    @Valid
    @NotNull
    @Nonnull
    public Set<Loadtest> loadtests = new LinkedHashSet<Loadtest>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RuntimeQualityAnalysis() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public RuntimeQualityAnalysis(RuntimeQualityAnalysis source) {
        super();
        this.monitoring = source.monitoring;
        this.resilience = source.resilience;
        this.loadtests = source.loadtests;
    }

    /**
     * 
     * @param monitoring
     *     Configurations for specified monitoring.
     * @param resilience
     *     Configurations for specified resilience tests.
     * @param loadtests
     *     Configurations for specified load tests.
     */
    @ConstructorProperties({
        "monitoring",
        "resilience",
        "loadtests"
    })
    public RuntimeQualityAnalysis(Set<Monitoring> monitoring, Set<Resilience> resilience, Set<Loadtest> loadtests) {
        super();
        this.monitoring = monitoring;
        this.resilience = resilience;
        this.loadtests = loadtests;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RuntimeQualityAnalysis.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("monitoring");
        sb.append('=');
        sb.append(((this.monitoring == null)?"<null>":this.monitoring));
        sb.append(',');
        sb.append("resilience");
        sb.append('=');
        sb.append(((this.resilience == null)?"<null>":this.resilience));
        sb.append(',');
        sb.append("loadtests");
        sb.append('=');
        sb.append(((this.loadtests == null)?"<null>":this.loadtests));
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
        result = ((result* 31)+((this.monitoring == null)? 0 :this.monitoring.hashCode()));
        result = ((result* 31)+((this.resilience == null)? 0 :this.resilience.hashCode()));
        result = ((result* 31)+((this.loadtests == null)? 0 :this.loadtests.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuntimeQualityAnalysis) == false) {
            return false;
        }
        RuntimeQualityAnalysis rhs = ((RuntimeQualityAnalysis) other);
        return ((((this.monitoring == rhs.monitoring)||((this.monitoring!= null)&&this.monitoring.equals(rhs.monitoring)))&&((this.resilience == rhs.resilience)||((this.resilience!= null)&&this.resilience.equals(rhs.resilience))))&&((this.loadtests == rhs.loadtests)||((this.loadtests!= null)&&this.loadtests.equals(rhs.loadtests))));
    }

}
