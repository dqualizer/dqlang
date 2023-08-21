package io.github.dqualizer.dqlang.types.adapter.k6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.dqualizer.dqlang.types.adapter.k6.loadprofile.LoadProfile;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;


/**
 * K6-Constants
 * <p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "accuracy",
        "load_profile",
        "response_time"
})
@Generated("jsonschema2pojo")
public class K6Constants {

    /**
     * An object with lower and upper boundaries to determine a accuracy (Required)
     */
    @JsonProperty("accuracy")
    @JsonPropertyDescription("An object with lower and upper boundaries to determine a accuracy")
    @Valid

    public Accuracy accuracy;
    /**
     * Constants for different load profiles (Required)
     */

    @JsonProperty("load_profile")
    @JsonPropertyDescription("Constants for different load profiles")
    @Valid

    public LoadProfile loadProfile;
    /**
     * Response times in milliseconds (Required)
     */

    @JsonProperty("response_time")
    @JsonPropertyDescription("Response times in milliseconds")
    @Valid

    public ResponseTime responseTime;

    /**
     * No args constructor for use in serialization
     */
    public K6Constants() {
    }

    /**
     * @param source the object being copied
     */
    public K6Constants(K6Constants source) {
        super();
        this.accuracy = source.accuracy;
        this.loadProfile = source.loadProfile;
        this.responseTime = source.responseTime;
    }

    /**
     * @param responseTime Response times in milliseconds.
     * @param accuracy     An object with lower and upper boundaries to determine a accuracy.
     * @param loadProfile  Constants for different load profiles.
     */
    @ConstructorProperties({
            "accuracy",
            "loadProfile",
            "responseTime"
    })
    public K6Constants(Accuracy accuracy, LoadProfile loadProfile, ResponseTime responseTime) {
        super();
        this.accuracy = accuracy;
        this.loadProfile = loadProfile;
        this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(K6Constants.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("accuracy");
        sb.append('=');
        sb.append(((this.accuracy == null) ? "<null>" : this.accuracy));
        sb.append(',');
        sb.append("loadProfile");
        sb.append('=');
        sb.append(((this.loadProfile == null) ? "<null>" : this.loadProfile));
        sb.append(',');
        sb.append("responseTime");
        sb.append('=');
        sb.append(((this.responseTime == null) ? "<null>" : this.responseTime));
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
        result = ((result * 31) + ((this.accuracy == null) ? 0 : this.accuracy.hashCode()));
        result = ((result * 31) + ((this.loadProfile == null) ? 0 : this.loadProfile.hashCode()));
        result = ((result * 31) + ((this.responseTime == null) ? 0 : this.responseTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof K6Constants) == false) {
            return false;
        }
        K6Constants rhs = ((K6Constants) other);
        return ((((this.accuracy == rhs.accuracy) || ((this.accuracy != null) && this.accuracy.equals(rhs.accuracy))) && ((this.loadProfile == rhs.loadProfile) || ((this.loadProfile != null) && this.loadProfile.equals(
                rhs.loadProfile)))) && ((this.responseTime == rhs.responseTime) || ((this.responseTime != null) && this.responseTime.equals(
                rhs.responseTime))));
    }

}
