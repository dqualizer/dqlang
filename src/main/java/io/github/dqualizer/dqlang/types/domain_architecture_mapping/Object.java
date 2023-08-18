package io.github.dqualizer.dqlang.types.domain_architecture_mapping;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "dq_id",
        "name",
        "operation_id",
        "type",
        "implements",
        "objects",
        "activities"
})
@Generated("jsonschema2pojo")
public class Object {

    /**
     * Unique ID, which references this object within dqualizer (Required)
     */
    @JsonProperty("dq_id")
    @JsonPropertyDescription("Unique ID, which references this object within dqualizer")

    public String dqId;
    /**
     * Name of this object inside the Domain Story, if this object is not part of a domain story, use the class name
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of this object inside the Domain Story, if this object is not part of a domain story, use the class name")

    public String name;
    /**
     * Fully qualified name of this artifact (Required)
     */
    @JsonProperty("operation_id")
    @JsonPropertyDescription("Fully qualified name of this artifact")

    public String operationId;
    /**
     * Type of this object (Required)
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of this object")

    public Object.Type type;
    /**
     * References to interfaces or abstract classes that are implemented by this object (Can be null)
     */

    @JsonProperty("implements")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("References to interfaces or abstract classes that are implemented by this object")
    @Valid
    public Set<String> _implements = new LinkedHashSet<String>();
    /**
     * References to other objects that are inside this class (Can be null)
     */

    @JsonProperty("objects")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("References to other objects that are inside this class")
    @Valid
    public Set<String> objects = new LinkedHashSet<String>();
    /**
     * List of objects that represent Activities from Domain Stories (Can be null)
     */

    @JsonProperty("activities")
    @JsonPropertyDescription("List of objects that represent Activities from Domain Stories")
    @Valid
    public List<Activity> activities = new ArrayList<Activity>();

    /**
     * No args constructor for use in serialization
     */
    public Object() {
    }

    /**
     * @param source the object being copied
     */
    public Object(Object source) {
        super();
        this.dqId = source.dqId;
        this.name = source.name;
        this.operationId = source.operationId;
        this.type = source.type;
        this._implements = source._implements;
        this.objects = source.objects;
        this.activities = source.activities;
    }

    /**
     * @param _implements References to interfaces or abstract classes that are implemented by this object.
     * @param activities  List of objects that represent Activities from Domain Stories.
     * @param dqId        Unique ID, which references this object within dqualizer.
     * @param objects     References to other objects that are inside this class.
     * @param name        Name of this object inside the Domain Story, if this object is not part of a domain story, use
     *                    the class name.
     * @param operationId Fully qualified name of this artifact.
     * @param type        Type of this object.
     */
    @ConstructorProperties({
            "dqId",
            "name",
            "operationId",
            "type",
            "_implements",
            "objects",
            "activities"
    })
    public Object(String dqId,
                  String name,
                  String operationId,
                  Object.Type type,
                  Set<String> _implements,
                  Set<String> objects,
                  List<Activity> activities) {
        super();
        this.dqId = dqId;
        this.name = name;
        this.operationId = operationId;
        this.type = type;
        this._implements = _implements;
        this.objects = objects;
        this.activities = activities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Object.class.getName())
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
        sb.append("_implements");
        sb.append('=');
        sb.append(((this._implements == null) ? "<null>" : this._implements));
        sb.append(',');
        sb.append("objects");
        sb.append('=');
        sb.append(((this.objects == null) ? "<null>" : this.objects));
        sb.append(',');
        sb.append("activities");
        sb.append('=');
        sb.append(((this.activities == null) ? "<null>" : this.activities));
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
        result = ((result * 31) + ((this._implements == null) ? 0 : this._implements.hashCode()));
        result = ((result * 31) + ((this.activities == null) ? 0 : this.activities.hashCode()));
        result = ((result * 31) + ((this.dqId == null) ? 0 : this.dqId.hashCode()));
        result = ((result * 31) + ((this.objects == null) ? 0 : this.objects.hashCode()));
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
        if ((other instanceof Object) == false) {
            return false;
        }
        Object rhs = ((Object) other);
        return ((((((((this._implements == rhs._implements) || ((this._implements != null) && this._implements.equals(
                rhs._implements))) && ((this.activities == rhs.activities) || ((this.activities != null) && this.activities.equals(
                rhs.activities)))) && ((this.dqId == rhs.dqId) || ((this.dqId != null) && this.dqId.equals(rhs.dqId)))) && ((this.objects == rhs.objects) || ((this.objects != null) && this.objects.equals(
                rhs.objects)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.operationId == rhs.operationId) || ((this.operationId != null) && this.operationId.equals(
                rhs.operationId)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))));
    }


    /**
     * Type of this object
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        MODULE("module"),
        CLASS("class"),
        INTERFACE("interface"),
        VARIABLE("variable");
        private final String value;
        private final static Map<String, Object.Type> CONSTANTS = new HashMap<String, Object.Type>();

        static {
            for (Object.Type c : values()) {
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
        public static Object.Type fromValue(String value) {
            Object.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
