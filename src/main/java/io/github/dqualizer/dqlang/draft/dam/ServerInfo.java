package io.github.dqualizer.dqlang.draft.dam;

import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class ServerInfo {

    private String id;
    private String host;
    private String environment;

    public ServerInfo() {
        this.id = new ObjectId().toHexString();
    }
}
