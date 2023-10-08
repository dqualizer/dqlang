package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.Identifiable;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
public class WorkObject extends DSTEntity {

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
