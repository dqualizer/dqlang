package io.github.dqualizer.dqlang.types.domain_architecture_mapping;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "dq_id",
        "name",
        "operation_id",
        "type",
        "parameter",
        "endpoint"
})
@Generated("jsonschema2pojo")
public class Activity {

    /**
     * Unique ID, which references this object within dqualizer (Required)
     */
    @JsonProperty("dq_id")
    @JsonPropertyDescription("Unique ID, which references this object within dqualizer")

    public String dqId;
    /**
     * Name of this object inside the Domain Story (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of this object inside the Domain Story")

    public String name;
    /**
     * Name of this object inside the source code (Required)
     */
    @JsonProperty("operation_id")
    @JsonPropertyDescription("Name of this object inside the source code")

    public String operationId;
    /**
     * Type of this object (Required)
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of this object")

    public Activity.Type type;
    /**
     * Parameter for this object (Required)
     */
    @JsonProperty("parameter")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Parameter for this object")
    @Valid

    public Set<String> parameter = new LinkedHashSet<String>();
    /**
     * Information about the API endpoint of this object
     */

    @JsonProperty("endpoint")
    @JsonPropertyDescription("Information about the API endpoint of this object")
    @Valid
    public Endpoint endpoint;

    /**
     * No args constructor for use in serialization
     */
    public Activity() {
    }

    /**
     * @param source the object being copied
     */
    public Activity(Activity source) {
        super();
        this.dqId = source.dqId;
        this.name = source.name;
        this.operationId = source.operationId;
        this.type = source.type;
        this.parameter = source.parameter;
        this.endpoint = source.endpoint;
    }

    /**
     * @param endpoint    Information about the API endpoint of this object.
     * @param dqId        Unique ID, which references this object within dqualizer.
     * @param parameter   Parameter for this object.
     * @param name        Name of this object inside the Domain Story.
     * @param operationId Name of this object inside the source code.
     * @param type        Type of this object.
     */
    @ConstructorProperties({
            "dqId",
            "name",
            "operationId",
            "type",
            "parameter",
            "endpoint"
    })
    public Activity(String dqId,
                    String name,
                    String operationId,
                    Activity.Type type,
                    Set<String> parameter,
                    Endpoint endpoint) {
        super();
        this.dqId = dqId;
        this.name = name;
        this.operationId = operationId;
        this.type = type;
        this.parameter = parameter;
        this.endpoint = endpoint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Activity.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("dqId");
        sb.append('=');
        sb.append(((this.dqId == null) ? "<null>" : this.dqId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("operationId");
        sb.append('=');
        sb.append(((this.operationId == null) ? "<null>" : this.operationId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("parameter");
        sb.append('=');
        sb.append(((this.parameter == null) ? "<null>" : this.parameter));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null) ? "<null>" : this.endpoint));
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
        result = ((result * 31) + ((this.endpoint == null) ? 0 : this.endpoint.hashCode()));
        result = ((result * 31) + ((this.dqId == null) ? 0 : this.dqId.hashCode()));
        result = ((result * 31) + ((this.parameter == null) ? 0 : this.parameter.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.operationId == null) ? 0 : this.operationId.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Activity) == false) {
            return false;
        }
        Activity rhs = ((Activity) other);
        return (((((((this.endpoint == rhs.endpoint) || ((this.endpoint != null) && this.endpoint.equals(rhs.endpoint))) && ((this.dqId == rhs.dqId) || ((this.dqId != null) && this.dqId.equals(
                rhs.dqId)))) && ((this.parameter == rhs.parameter) || ((this.parameter != null) && this.parameter.equals(
                rhs.parameter)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.operationId == rhs.operationId) || ((this.operationId != null) && this.operationId.equals(
                rhs.operationId)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))));
    }


    /**
     * Type of this object
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        METHOD("method"),
        CLASS("class");
        private final String value;
        private final static Map<String, Activity.Type> CONSTANTS = new HashMap<String, Activity.Type>();

        static {
            for (Activity.Type c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Activity.Type fromValue(String value) {
            Activity.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
