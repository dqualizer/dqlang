package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class LateResponsesStimulus extends ResilienceStimulus {

    private int injectionFrequency;
    private int minDelayMilliseconds;
    private int maxDelayMilliseconds;

    public LateResponsesStimulus(int pauseBeforeTriggeringSeconds, int experimentDurationSeconds, int injectionFrequency, int minDelayMilliseconds, int maxDelayMilliseconds) {
        this.setPauseBeforeTriggeringSeconds(pauseBeforeTriggeringSeconds);
        this.setExperimentDurationSeconds(experimentDurationSeconds);
        this.injectionFrequency = injectionFrequency;
        this.minDelayMilliseconds = minDelayMilliseconds;
        this.maxDelayMilliseconds = maxDelayMilliseconds;
    }

    public int getInjectionFrequency() {
        return injectionFrequency;
    }

    public int getMinDelayMilliseconds() {
        return minDelayMilliseconds;
    }

    public int getMaxDelayMilliseconds() {
        return maxDelayMilliseconds;
    }
}