package io.github.dqualizer.dqlang.types.dam;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Activity {
    @Id
    private String id;
    private String name;
    @JsonProperty("method_path")
    private String methodPath;
    private String initiator;
    private String workObject;
    private String action;
    private String type;
    private List<String> parameter;
    private Endpoint endpoint;

    public Activity() {
        this.id = new ObjectId().toHexString();
    }
}
