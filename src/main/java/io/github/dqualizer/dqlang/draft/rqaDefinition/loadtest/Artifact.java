package io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artifact {
    @JsonProperty("system_id")
    private String systemId;
    @JsonProperty("activity")
    private String activityId;
}
