package dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

/**
 * Java class for the modeling
 */
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class RuntimeQualityAnalysisDefintion {
    private val version = 0
    private val context: String? = null
    private val environment: String? = null

    @JsonProperty("runtime_quality_analysis")
    private val rqa: RuntimeQualityAnalysis? = null
}
