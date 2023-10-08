package io.github.dqualizer.dqlang.types.dam.domainstory;

import io.github.dqualizer.dqlang.types.dam.Identifiable;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
public class WorkObject extends DSTEntity {

        protected final WorkObjectType type;

        public WorkObject(@NotNull String name, @NotNull WorkObjectType type) {
                super(name);
                this.type = type;
        }

        public WorkObject(@NotNull String name) {
                this(name, WorkObjectType.MISC);
        }
}
