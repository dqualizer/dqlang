
package dqualizer.dqlang.types.adapter.k6;

import java.beans.ConstructorProperties;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Lower an upper boundaries for repetitions
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "min",
    "max"
})
@Generated("jsonschema2pojo")
public class Repetition {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("min")
    @NotNull
    @Nonnull
    public int min;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("max")
    @NotNull
    @Nonnull
    public int max;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Repetition() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public Repetition(Repetition source) {
        super();
        this.min = source.min;
        this.max = source.max;
    }

    @ConstructorProperties({
        "min",
        "max"
    })
    public Repetition(int min, int max) {
        super();
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Repetition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("min");
        sb.append('=');
        sb.append(this.min);
        sb.append(',');
        sb.append("max");
        sb.append('=');
        sb.append(this.max);
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
        result = ((result* 31)+ this.max);
        result = ((result* 31)+ this.min);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Repetition) == false) {
            return false;
        }
        Repetition rhs = ((Repetition) other);
        return ((this.max == rhs.max)&&(this.min == rhs.min));
    }

}
