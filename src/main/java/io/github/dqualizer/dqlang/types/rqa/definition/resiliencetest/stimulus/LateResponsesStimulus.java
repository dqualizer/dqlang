package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class LateResponsesStimulus extends ResilienceStimulus {


    // TODO To what extend makes field "type" sense if already a subtype ResilienceStimulus?
    public LateResponsesStimulus(int accuracy){
        this.setAccuracy(accuracy);
    }

    public LateResponsesStimulus(String type, int accuracy){
        this.setAccuracy(accuracy);
    }
}