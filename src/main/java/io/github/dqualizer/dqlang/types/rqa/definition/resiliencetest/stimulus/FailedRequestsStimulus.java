package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class FailedRequestsStimulus extends ResilienceStimulus {


    // TODO To what extend makes field "type" sense if already a subtype ResilienceStimulus?
    public FailedRequestsStimulus(int accuracy){
        this.setAccuracy(accuracy);
    }

    public FailedRequestsStimulus(String type, int accuracy){
        this.setAccuracy(accuracy);
    }
}