package io.github.dqualizer.dqlang.types.rqa.definition.stimulus;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile.LoadProfile;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Workload {

    private WorkloadType type;

    @JsonProperty("load_profile")
    private LoadProfile loadProfile;
}

