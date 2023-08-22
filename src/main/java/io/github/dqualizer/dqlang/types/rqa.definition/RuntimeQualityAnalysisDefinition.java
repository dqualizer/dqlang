package io.github.dqualizer.dqlang.draft.rqaDefinition;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.RuntimeQualityAnalysis;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Environment;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Document
public class RuntimeQualityAnalysisDefinition {

    @Id
    private String id;

    @Indexed(unique = true)
    private String name;
    private String version;
    @JsonProperty("domain_id")
    @NotNull
    private String domainId;
    private Environment environment;
    @JsonProperty("runtime_quality_analysis")
    private RuntimeQualityAnalysis runtimeQualityAnalysis;

    public RuntimeQualityAnalysisDefinition(String name, String version, Environment environment, String domainId, RuntimeQualityAnalysis runtimeQualityAnalysis) {
        this.name = name;
        this.version = version;
        this.environment = environment;
        this.domainId = domainId;
        this.runtimeQualityAnalysis = runtimeQualityAnalysis;
    }
}
