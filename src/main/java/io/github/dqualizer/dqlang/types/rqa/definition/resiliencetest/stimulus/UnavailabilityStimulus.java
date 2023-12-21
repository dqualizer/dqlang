package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UnavailabilityStimulus extends ResilienceStimulus {


    // TODO To what extend makes field "type" sense if already a subtype ResilienceStimulus?
    public UnavailabilityStimulus(int accuracy){
        this.setAccuracy(accuracy);
    }

    public UnavailabilityStimulus(String type, int accuracy){
        this.setAccuracy(accuracy);
    }
}