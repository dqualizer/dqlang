package io.github.dqualizer.dqlang.types.dam;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class System {
    @Id
    private String id;
    private String name;
    @JsonProperty("operation_id")
    private String operationId;
    private String type;
    private String processPath;
    @JsonProperty("implements")
    private List<Object> myimplements;
    private List<String> objects;

    private List<Activity> activities;

    public System() {
        this.id = new ObjectId().toHexString();
    }
}
