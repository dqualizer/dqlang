package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class UnavailabilityStimulus extends ResilienceStimulus {

    public UnavailabilityStimulus(int pauseBeforeTriggeringSeconds, int experimentDurationSeconds) {
      this.setPauseBeforeTriggeringSeconds(pauseBeforeTriggeringSeconds);
      this.setExperimentDurationSeconds(experimentDurationSeconds);
    }
}