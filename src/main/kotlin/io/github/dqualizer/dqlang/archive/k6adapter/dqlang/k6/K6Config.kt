package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6

/**
 * Java class for k6 loadtest configurations
 */
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class K6Config {
    val name: String? = null
    val baseURL: String? = null
    val loadTests: LinkedHashSet<io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.K6LoadTest>? = null
}
