package io.github.dqualizer.dqlang.types.dam.domainstory;

import io.github.dqualizer.dqlang.types.dam.Identifiable;
import org.jetbrains.annotations.NotNull;

public abstract class WorkObject extends DSTEntity {
        public WorkObject(@NotNull String name, @NotNull WorkObjectType type) {
                super(name);
        }
}
