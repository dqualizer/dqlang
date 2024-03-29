package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class FailedRequestsStimulus extends ResilienceStimulus {

    private int injectionFrequency;

    public FailedRequestsStimulus(int pauseBeforeTriggeringSeconds, int experimentDurationSeconds, int injectionFrequency) {
        this.setPauseBeforeTriggeringSeconds(pauseBeforeTriggeringSeconds);
        this.setExperimentDurationSeconds(experimentDurationSeconds);
        this.injectionFrequency = injectionFrequency;
    }

    public int getInjectionFrequency() {
        return injectionFrequency;
    }
}