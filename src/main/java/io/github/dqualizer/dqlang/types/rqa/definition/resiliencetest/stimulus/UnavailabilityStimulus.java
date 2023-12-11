package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.HighestLoad;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.TimeToHighestLoad;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.LoadStimulus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnavailabilityStimulus extends ResilienceStimulus {

    /*@JsonProperty("highest_load")
    private HighestLoad highestLoad;
    @JsonProperty("time_to_highest_load")

    private TimeToHighestLoad timeToHighestLoad;*/

    // TODO To what extend makes field "type" sense if already a subtype ResilienceStimulus?
    public UnavailabilityStimulus(String type, int accuracy){
        this.setType(type);
        this.setAccuracy(accuracy);
    }
}