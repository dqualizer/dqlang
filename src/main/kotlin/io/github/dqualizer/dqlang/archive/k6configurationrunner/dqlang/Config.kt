package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang

/**
 * Java class for inoffical k6 loadtest configurations
 */
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Config {
    val name: String? = null
    val baseURL: String? = null
    val loadTests: LinkedHashSet<io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.LoadTest>? = null
}
