package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class FailedRequestsStimulus extends ResilienceStimulus {

    public FailedRequestsStimulus(int pauseBeforeTriggeringSeconds, int experimentDurationSeconds) {
        super(pauseBeforeTriggeringSeconds, experimentDurationSeconds);
    }
}