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
    // only used for resilience tests at the moment, load tests use top level base_url
    @JsonProperty("base_url")
    private String baseUrl;
    @JsonProperty("operation_id")
    private String operationId;
    private String type;
    @JsonProperty("process_path")
    private String processPath;
    @JsonProperty("implements")
    private List<Object> myimplements;
    private List<String> objects;

    private List<Activity> activities;

    public System() {
        this.id = new ObjectId().toHexString();
    }
}
