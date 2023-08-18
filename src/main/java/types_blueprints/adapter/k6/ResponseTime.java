
package types_blueprints.adapter.k6;

import java.beans.ConstructorProperties;
import javax.annotation.Nonnull;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Response times in milliseconds
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "satisfied",
    "tolerated",
    "frustrated"
})
@Generated("jsonschema2pojo")
public class ResponseTime {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("satisfied")
    @NotNull
    @Nonnull
    public int satisfied;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tolerated")
    @NotNull
    @Nonnull
    public int tolerated;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("frustrated")
    @NotNull
    @Nonnull
    public int frustrated;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseTime() {
    }

    /**
     * 
     * @param source
     *     the object being copied
     */
    public ResponseTime(ResponseTime source) {
        super();
        this.satisfied = source.satisfied;
        this.tolerated = source.tolerated;
        this.frustrated = source.frustrated;
    }

    @ConstructorProperties({
        "satisfied",
        "tolerated",
        "frustrated"
    })
    public ResponseTime(int satisfied, int tolerated, int frustrated) {
        super();
        this.satisfied = satisfied;
        this.tolerated = tolerated;
        this.frustrated = frustrated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResponseTime.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("satisfied");
        sb.append('=');
        sb.append(this.satisfied);
        sb.append(',');
        sb.append("tolerated");
        sb.append('=');
        sb.append(this.tolerated);
        sb.append(',');
        sb.append("frustrated");
        sb.append('=');
        sb.append(this.frustrated);
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
        result = ((result* 31)+ this.tolerated);
        result = ((result* 31)+ this.frustrated);
        result = ((result* 31)+ this.satisfied);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseTime) == false) {
            return false;
        }
        ResponseTime rhs = ((ResponseTime) other);
        return (((this.tolerated == rhs.tolerated)&&(this.frustrated == rhs.frustrated))&&(this.satisfied == rhs.satisfied));
    }

}
