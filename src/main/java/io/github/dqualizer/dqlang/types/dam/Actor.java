package io.github.dqualizer.dqlang.types.dam;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Actor {
    private String id;
    private String actor_name;
    @JsonProperty("is_group")
    private boolean isGroup = false;

    public Actor() {
        this.id = new ObjectId().toHexString();
    }
}
