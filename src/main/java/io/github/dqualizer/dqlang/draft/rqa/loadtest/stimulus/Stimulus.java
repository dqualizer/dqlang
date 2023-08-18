package io.github.dqualizer.dqlang.draft.rqa.loadtest.stimulus;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.draft.rqa.enums.LoadProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Stimulus {
    @JsonProperty("load_profile")
    private LoadProfile loadProfile;

    private int accuracy;

}