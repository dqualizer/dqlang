package io.github.dqualizer.dqlang.draft.dam;

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
    private String operation_id;
    private String type;
    @JsonProperty("implements")
    private List<Object> myimplements;
    private List<String> objects;

    private List<Activity> activities;

    public System() {
        this.id = new ObjectId().toHexString();
    }
}
