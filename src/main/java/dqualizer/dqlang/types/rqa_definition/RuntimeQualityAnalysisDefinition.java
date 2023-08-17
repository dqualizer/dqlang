
package dqualizer.dqlang.types.rqa_definition;

import java.beans.ConstructorProperties;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Runtime Quality Analysis Definition
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "version",
    "context",
    "environment",
    "runtime_quality_analysis"
})
@Generated("jsonschema2pojo")
public class RuntimeQualityAnalysisDefinition {

    /**
     * A unique identifier for the rqa definition
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the rqa definition")
    public int id;
    /**
     * Every Rqa-Definition has a unique name
     * (Can be null)
     * 
     */
    @Nullable
    @JsonProperty("name")
    @JsonPropertyDescription("Every Rqa-Definition has a unique name")
    public String name;
    /**
     * Version of this modeling representation
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of this modeling representation")
    @NotNull
    @Nonnull
    public int version;
    /**
     * The name of the Bounded Context to which this modeling belongs
     * (Required)
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The name of the Bounded Context to which this modeling belongs")
    @Size(min = 1)
    @NotNull
    @Nonnull
    public String context;
    /**
     * The environment this host belongs to
     * (Required)
     * 
     */
    @JsonProperty("environment")
    @JsonPropertyDescription("The environment this host belongs to")
    @NotNull
    @Nonnull
    public String environment;
    /**
     * 
     * (Required)
     * 
     */
    @Nullable
    @JsonProperty("runtime_quality_analysis")
    @Valid
    @NotNull
    @Nonnull
    public RuntimeQualityAnalysis runtimeQualityAnalysis;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RuntimeQualityAnalysisDefinition() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public RuntimeQualityAnalysisDefinition(RuntimeQualityAnalysisDefinition source) {
        super();
        this.id = source.id;
        this.name = source.name;
        this.version = source.version;
        this.context = source.context;
        this.environment = source.environment;
        this.runtimeQualityAnalysis = source.runtimeQualityAnalysis;
    }

    /**
     * 
     * @param environment
     *     The environment this host belongs to.
     * @param name
     *     Every Rqa-Definition has a unique name.
     * @param context
     *     The name of the Bounded Context to which this modeling belongs.
     * @param id
     *     A unique identifier for the rqa definition.
     * @param version
     *     Version of this modeling representation.
     */
    @ConstructorProperties({
        "id",
        "name",
        "version",
        "context",
        "environment",
        "runtimeQualityAnalysis"
    })
    public RuntimeQualityAnalysisDefinition(int id, String name, int version, String context, String environment, RuntimeQualityAnalysis runtimeQualityAnalysis) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.context = context;
        this.environment = environment;
        this.runtimeQualityAnalysis = runtimeQualityAnalysis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RuntimeQualityAnalysisDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(this.version);
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("environment");
        sb.append('=');
        sb.append(((this.environment == null)?"<null>":this.environment));
        sb.append(',');
        sb.append("runtimeQualityAnalysis");
        sb.append('=');
        sb.append(((this.runtimeQualityAnalysis == null)?"<null>":this.runtimeQualityAnalysis));
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
        result = ((result* 31)+((this.runtimeQualityAnalysis == null)? 0 :this.runtimeQualityAnalysis.hashCode()));
        result = ((result* 31)+((this.environment == null)? 0 :this.environment.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+ this.id);
        result = ((result* 31)+ this.version);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuntimeQualityAnalysisDefinition) == false) {
            return false;
        }
        RuntimeQualityAnalysisDefinition rhs = ((RuntimeQualityAnalysisDefinition) other);
        return (((((((this.runtimeQualityAnalysis == rhs.runtimeQualityAnalysis)||((this.runtimeQualityAnalysis!= null)&&this.runtimeQualityAnalysis.equals(rhs.runtimeQualityAnalysis)))&&((this.environment == rhs.environment)||((this.environment!= null)&&this.environment.equals(rhs.environment))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&(this.id == rhs.id))&&(this.version == rhs.version));
    }

}
