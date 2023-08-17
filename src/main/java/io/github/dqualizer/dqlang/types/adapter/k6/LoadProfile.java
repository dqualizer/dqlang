package io.github.dqualizer.dqlang.types.adapter.k6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;


/**
 * Constants for different load profiles
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "load_peak",
        "load_increase",
        "constant_load"
})
@Generated("jsonschema2pojo")
public class LoadProfile {

    /**
     * Steady increase in load (Required)
     */

    @JsonProperty("load_peak")
    @JsonPropertyDescription("Steady increase in load")
    @Valid

    public LoadPeak loadPeak;
    /**
     * Increasing increase in load (Required)
     */

    @JsonProperty("load_increase")
    @JsonPropertyDescription("Increasing increase in load")
    @Valid

    public LoadIncrease loadIncrease;
    /**
     * Constant load throughout the whole test (Required)
     */

    @JsonProperty("constant_load")
    @JsonPropertyDescription("Constant load throughout the whole test")
    @Valid

    public ConstantLoad constantLoad;

    /**
     * No args constructor for use in serialization
     */
    public LoadProfile() {
    }

    /**
     * @param source the object being copied
     */
    public LoadProfile(LoadProfile source) {
        super();
        this.loadPeak = source.loadPeak;
        this.loadIncrease = source.loadIncrease;
        this.constantLoad = source.constantLoad;
    }

    /**
     * @param constantLoad Constant load throughout the whole test.
     * @param loadPeak     Steady increase in load.
     * @param loadIncrease Increasing increase in load.
     */
    @ConstructorProperties({
            "loadPeak",
            "loadIncrease",
            "constantLoad"
    })
    public LoadProfile(LoadPeak loadPeak, LoadIncrease loadIncrease, ConstantLoad constantLoad) {
        super();
        this.loadPeak = loadPeak;
        this.loadIncrease = loadIncrease;
        this.constantLoad = constantLoad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadProfile.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("loadPeak");
        sb.append('=');
        sb.append(((this.loadPeak == null) ? "<null>" : this.loadPeak));
        sb.append(',');
        sb.append("loadIncrease");
        sb.append('=');
        sb.append(((this.loadIncrease == null) ? "<null>" : this.loadIncrease));
        sb.append(',');
        sb.append("constantLoad");
        sb.append('=');
        sb.append(((this.constantLoad == null) ? "<null>" : this.constantLoad));
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
        result = ((result * 31) + ((this.loadPeak == null) ? 0 : this.loadPeak.hashCode()));
        result = ((result * 31) + ((this.loadIncrease == null) ? 0 : this.loadIncrease.hashCode()));
        result = ((result * 31) + ((this.constantLoad == null) ? 0 : this.constantLoad.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadProfile) == false) {
            return false;
        }
        LoadProfile rhs = ((LoadProfile) other);
        return ((((this.loadPeak == rhs.loadPeak) || ((this.loadPeak != null) && this.loadPeak.equals(rhs.loadPeak))) && ((this.loadIncrease == rhs.loadIncrease) || ((this.loadIncrease != null) && this.loadIncrease.equals(
                rhs.loadIncrease)))) && ((this.constantLoad == rhs.constantLoad) || ((this.constantLoad != null) && this.constantLoad.equals(
                rhs.constantLoad))));
    }

}
