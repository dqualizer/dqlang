package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class FailedRequestsStimulus extends ResilienceStimulus {

    private int injectionFrequency;

    public FailedRequestsStimulus(int pauseBeforeTriggeringSeconds, int experimentDurationSeconds, int injectionFrequency) {
        super(pauseBeforeTriggeringSeconds, experimentDurationSeconds);
        this.injectionFrequency = injectionFrequency;
    }

    public int getInjectionFrequency() {
        return injectionFrequency;
    }
}