package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UnavailabilityStimulus extends ResilienceStimulus {

    public UnavailabilityStimulus(int pauseBeforeTriggeringSeconds, int experimentDurationSeconds) {
        super(pauseBeforeTriggeringSeconds, experimentDurationSeconds);
    }
}