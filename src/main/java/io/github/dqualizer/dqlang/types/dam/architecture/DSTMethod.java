package io.github.dqualizer.dqlang.types.dam.architecture;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.domainstory.Activity;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * former "Object" class
 */
@Data
public class DSTMethod {
    @Id
    private String id;
    private String name;
    @JsonProperty("operation_id")
    private String operationId;
    private String type;
    @JsonProperty("implements")
    private List<Object> myimplements;
    private List<String> objects;

    private List<Activity> activities;

    public DSTMethod() {
        this.id = new ObjectId().toHexString();
    }
}
