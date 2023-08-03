package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest

/**
 * Java class for the general dqualizer loadtest configuration
 */
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class LoadTestConfig {
    val version = 0
    val context: String? = null
    val environment: String? = null

    @JsonProperty("base_url")
    val baseURL: String? = null

    @JsonProperty("load_tests")
    val loadTests: LinkedHashSet<io.github.dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.LoadTest>? = null
}
