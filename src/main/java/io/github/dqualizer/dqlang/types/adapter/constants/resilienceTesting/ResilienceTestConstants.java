package io.github.dqualizer.dqlang.types.adapter.constants.resilienceTesting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.adapter.constants.ResponseMeasure;
import lombok.Getter;
import lombok.ToString;

/**
 * Java class for load test constants definitions
 */
@Getter
@ToString
public class ResilienceTestConstants {

    @JsonProperty("recovery_time")
    private ResponseMeasure recoveryTime;
    @JsonProperty("response_time")
    private ResponseMeasure responseTime;
    @JsonProperty("error_rate")
    private ResponseMeasure errorRate;
}
