package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@Getter
public class WorkObject extends DSTElement {

    protected final WorkObjectType type;

    @JsonCreator
    public WorkObject(
            @JsonProperty("name") @NotNull String name,
            @JsonProperty("type") @NotNull WorkObjectType type) {
        super(name);
        this.type = type;
    }

    public WorkObject(@NotNull String name) {
        this(name, WorkObjectType.MISC);
    }
}
