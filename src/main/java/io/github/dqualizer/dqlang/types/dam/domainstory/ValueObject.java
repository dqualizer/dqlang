package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@Getter
public class ValueObject extends DSTElement {
    @JsonCreator
    public ValueObject(@JsonProperty("name") @NotNull String name) {
        super(name);
    }
}
