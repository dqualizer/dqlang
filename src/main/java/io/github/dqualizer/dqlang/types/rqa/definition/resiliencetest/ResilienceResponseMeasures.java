package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Satisfaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResilienceResponseMeasures {

    //  Response measures not allowed for certain stimuli (e.g. Late Responses stimulus combined with recovery time response measure) should be disallowed in the dqAnalyzer
    @JsonProperty(value = "recovery_time", required = false)
    private Satisfaction recoveryTime;
    @JsonProperty(value = "error_rate", required = false)
    private Satisfaction errorRate;
    @JsonProperty(value = "response_time", required = false)
    private Satisfaction responseTime;
}
