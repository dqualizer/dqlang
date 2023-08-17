package io.github.dqualizer.dqlang.types.rqa_definition;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "object",
        "activity"
})
@Generated("jsonschema2pojo")
public class Artifact {

    /**
     * dq_id of an Actor or Work Object, where the loadtest was specified (Required)
     */
    @JsonProperty("object")
    @JsonPropertyDescription("dq_id of an Actor or Work Object, where the loadtest was specified")

    public String object;
    /**
     * dq_id of an Activity inside an object, if the loadtest was specified on an Activity (Can be null)
     */

    @JsonProperty("activity")
    @JsonPropertyDescription("dq_id of an Activity inside an object, if the loadtest was specified on an Activity")
    public String activity;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Artifact() {
    }

    /**
     * @param source the object being copied
     */
    public Artifact(Artifact source) {
        super();
        this.object = source.object;
        this.activity = source.activity;
    }

    /**
     * @param activity dq_id of an Activity inside an object, if the loadtest was specified on an Activity.
     * @param object   dq_id of an Actor or Work Object, where the loadtest was specified.
     */
    @ConstructorProperties({
            "object",
            "activity"
    })
    public Artifact(String object, String activity) {
        super();
        this.object = object;
        this.activity = activity;
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
        sb.append(Artifact.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null) ? "<null>" : this.object));
        sb.append(',');
        sb.append("activity");
        sb.append('=');
        sb.append(((this.activity == null) ? "<null>" : this.activity));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
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
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.activity == null) ? 0 : this.activity.hashCode()));
        result = ((result * 31) + ((this.object == null) ? 0 : this.object.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Artifact) == false) {
            return false;
        }
        Artifact rhs = ((Artifact) other);
        return ((((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(
                rhs.additionalProperties))) && ((this.activity == rhs.activity) || ((this.activity != null) && this.activity.equals(
                rhs.activity)))) && ((this.object == rhs.object) || ((this.object != null) && this.object.equals(rhs.object))));
    }

}
