package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.loadtest

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
    private val version = 0
    private val context: String? = null
    private val environment: String? = null

    @JsonProperty("base_url")
    private val baseURL: String? = null

    @JsonProperty("load_tests")
    private val loadTests: LinkedHashSet<io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.loadtest.LoadTest>? = null
}
