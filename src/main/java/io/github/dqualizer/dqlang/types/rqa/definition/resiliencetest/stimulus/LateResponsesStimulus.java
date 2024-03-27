package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class LateResponsesStimulus extends ResilienceStimulus {

    public LateResponsesStimulus(int pauseBeforeTriggeringSeconds, int experimentDurationSeconds) {
        super(pauseBeforeTriggeringSeconds, experimentDurationSeconds);
    }
}