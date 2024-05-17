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
    private String type;
    @JsonProperty("processName")
    private String processName;
    @JsonProperty("process_path")
    private String processPath;
    @JsonProperty("package_member")
    private String packageMember;
    @JsonProperty("implements")
    private List<Object> myimplements;
    // only used for resilience tests at the moment, load tests use top level base_url
    @JsonProperty("base_url")
    private String baseUrl;
    private List<String> objects;

    private List<Activity> activities;

    public System() {
        this.id = new ObjectId().toHexString();
    }
}
