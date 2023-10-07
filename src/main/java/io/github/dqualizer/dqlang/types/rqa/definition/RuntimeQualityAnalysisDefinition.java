package io.github.dqualizer.dqlang.types.rqa.definition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.Identifiable;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Environment;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document
public class RuntimeQualityAnalysisDefinition extends Identifiable {

    @Indexed(unique = true)
    private String name;
    private String version;
    @JsonProperty("domain_id")
    @NotNull
    private String domainId;
    @NotNull
    private String context;
    private Environment environment;
    @JsonProperty("runtime_quality_analysis")
    private RuntimeQualityAnalysis runtimeQualityAnalysis;

    @JsonCreator
    public RuntimeQualityAnalysisDefinition(
            @JsonProperty("name") String name,
            @JsonProperty("version") String version,
            @JsonProperty("environment") Environment environment,
            @JsonProperty("domain_id") String domainId,
            @JsonProperty("context") String context,
            @JsonProperty("runtime_quality_analysis") RuntimeQualityAnalysis runtimeQualityAnalysis) {
        this.name = name;
        this.version = version;
        this.environment = environment;
        this.domainId = domainId;
        this.runtimeQualityAnalysis = runtimeQualityAnalysis;
    }

}
