package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.mapping.EndpointMapping;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Data
@Document
public final class Activity {

    @Id
    private String id;
    private String name;
    @JsonProperty("operation_id")
    private String operationId;

    @DBRef
    private Actor initiator;

    /**
     * Endpoints that the activity reaches.
     * Have to be filled out by a technical expert.
     */
    @DBRef
    private Collection<EndpointMapping> endpoints;

    /**
     * Work objects that are along the path.
     */
    @DBRef
    private Collection<WorkObject> workObjects;

    /**
     * Name of the activity the actor applies to the work objects (e.g. sends).
     */
    private String action;

    public Activity() {
        this.id = new ObjectId().toHexString();
    }

    @Override
    public String toString() {
        return "Activity %s: %s %s %s to/for %s"
                .formatted(id, initiator, action.isBlank() ? "?" : action, workObjects, endpoints);
    }
}
