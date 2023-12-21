package io.github.dqualizer.dqlang.types.adapter.constants;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.adapter.accuracy.Accuracy;
import io.github.dqualizer.dqlang.types.adapter.symbolics.Symbolics;
import lombok.Getter;
import lombok.ToString;

/**
 * Java class for load test constants definitions
 */
@Getter
@ToString
public class LoadTestConstants {

    private Accuracy accuracy;
    @JsonProperty("technical_constants")
    private TechnicalConstants technicalConstants;
    private Symbolics symbolics;
    @JsonProperty("response_time")
    private ResponseTime responseTime;
}
