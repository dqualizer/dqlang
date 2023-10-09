package io.github.dqualizer.dqlang.types.dam;

import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;


public abstract class Identifiable {
    @Id
    private String id;

    /**
     * Read the class information stored in Mongo
     */
    private String _class;

    public final String getId() {
        return id;
    }

    public final String getSerializationClass() {
        return _class;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Identifiable that)) {
            return false;
        }
        if (id == null) {
            return false;
        }

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : System.identityHashCode(this);
    }
}
