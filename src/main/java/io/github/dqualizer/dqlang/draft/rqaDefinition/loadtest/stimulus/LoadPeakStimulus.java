package io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest.stimulus;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.dqualizer.dqlang.draft.rqaDefinition.enums.HighestLoad;
import io.github.dqualizer.dqlang.draft.rqaDefinition.enums.TimeToHighestLoad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoadPeakStimulus extends Stimulus {

    @JsonProperty("highest_load")
    private HighestLoad highestLoad;
    @JsonProperty("time_to_highest_load")

    private TimeToHighestLoad timeToHighestLoad;
}