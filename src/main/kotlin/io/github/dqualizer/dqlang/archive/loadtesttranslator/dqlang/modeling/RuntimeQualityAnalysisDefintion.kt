package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling

/**
 * Java class for the modeling
 */
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class RuntimeQualityAnalysisDefintion {
    val version = 0
    val context: String? = null
    val environment: String? = null

    @JsonProperty("runtime_quality_analysis")
    val rqa: io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.RuntimeQualityAnalysis? = null
}
