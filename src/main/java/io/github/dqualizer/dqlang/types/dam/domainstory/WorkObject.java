package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@Getter
public class WorkObject extends DSTElement {

    protected final WorkObjectType type;
    protected final List<ValueObject> valueObjects;

    @JsonCreator
    public WorkObject(@JsonProperty("name") String name,
                      @JsonProperty("type") WorkObjectType type,
                      @JsonProperty("value_objects") List<ValueObject> valueObjects) {
        super(name);
        this.type = type;
        this.valueObjects = valueObjects;
    }

    public WorkObject(String name) {
        this(name, WorkObjectType.MISC, List.of());
    }
}
