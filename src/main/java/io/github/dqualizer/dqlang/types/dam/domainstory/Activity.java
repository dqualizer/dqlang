package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.mapping.EndpointMapping;
import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Set;


@Document
public final class Activity extends DSTEntity {

    @DocumentReference
    private Actor initiator;

    /**
     * Endpoints that the activity reaches. Have to be filled out by a technical expert.
     */
    @DocumentReference
    private Set<EndpointMapping> endpoints;

    /**
     * Work objects that are along the path.
     */
    @DocumentReference
    private Set<WorkObject> workObjects;

    /**
     * Name of the activity the actor applies to the work objects (e.g. sends).
     */
    private String action;

    public Activity(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Activity %s: %s %s %s to/for %s"
                .formatted(getId(), initiator, action.isBlank() ? "?" : action, workObjects, endpoints);
    }
}
