package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants

/**
 * Java class for load test constants definitions
 */
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.accuracy.Accuracy
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.LoadProfile
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadTestConstants {
    val accuracy: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.accuracy.Accuracy? = null

    @JsonProperty("load_profile")
    val loadProfile: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.LoadProfile? = null

    @JsonProperty("response_time")
    val responseTime: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.ResponseTime? = null
}
