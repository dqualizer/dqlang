package dqualizer.dqlang.archive.k6configurationrunner.dqlang

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
    private val name: String? = null
    private val baseURL: String? = null
    private val loadTests: LinkedHashSet<LoadTest>? = null
}
