package io.github.dqualizer.dqlang.draft.dam;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Activity {
    @Id
    private  String id;
    private String name;
    private String operation_id;
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
