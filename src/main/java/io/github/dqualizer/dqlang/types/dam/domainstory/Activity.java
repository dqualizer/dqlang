package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.mapping.EndpointDAMapping;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.HashSet;
import java.util.Set;

public final class Activity extends DSTEntity {

    @DocumentReference
    private final Set<Actor> initiators = new HashSet<>();

    /**
     * Endpoints that the activity reaches. Have to be filled out by a technical expert.
     */
    @DocumentReference
    private final Set<EndpointDAMapping> endpoints = new HashSet<>();

    /**
     * Work objects that are along the path.
     */
    @DocumentReference
    private final Set<WorkObject> workObjects = new HashSet<>();

    /**
     * Name of the activity the actor applies to the work objects (e.g. sends).
     */
    private final String action;

    public Activity(@JsonProperty("name") String name,
                    @JsonProperty("action") String action) {
        super(name);
        this.action = action;
    }

    @Override
    public String toString() {
        return "Activity %s: %s %s %s to/for %s"
                .formatted(getId(), initiators, action.isBlank() ? "?" : action, workObjects, endpoints);
    }
}
