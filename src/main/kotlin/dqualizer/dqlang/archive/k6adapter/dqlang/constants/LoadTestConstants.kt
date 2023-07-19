package dqualizer.dqlang.archive.k6adapter.dqlang.constants

/**
 * Java class for load test constants definitions
 */
import com.fasterxml.jackson.annotation.JsonProperty
import dqualizer.dqlang.archive.k6adapter.dqlang.constants.accuracy.Accuracy
import dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.LoadProfile
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadTestConstants {
    private val accuracy: Accuracy? = null

    @JsonProperty("load_profile")
    private val loadProfile: LoadProfile? = null

    @JsonProperty("response_time")
    private val responseTime: ResponseTime? = null
}
