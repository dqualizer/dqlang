package dqualizer.dqlang.archive.k6adapter.dqlang.k6

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
    private val name: String? = null
    private val baseURL: String? = null
    private val loadTests: LinkedHashSet<K6LoadTest>? = null
}
