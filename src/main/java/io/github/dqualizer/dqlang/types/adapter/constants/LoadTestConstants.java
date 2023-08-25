package io.github.dqualizer.dqlang.types.adapter.constants;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.adapter.accuracy.Accuracy;
import io.github.dqualizer.dqlang.types.adapter.constants.loadprofile.LoadProfile;
import lombok.Getter;
import lombok.ToString;

/**
 * Java class for load test constants definitions
 */
@Getter
@ToString
public class LoadTestConstants {

    private Accuracy accuracy;
    @JsonProperty("load_profile")
    private LoadProfile loadProfile;
    @JsonProperty("response_time")
    private ResponseTime responseTime;
}
