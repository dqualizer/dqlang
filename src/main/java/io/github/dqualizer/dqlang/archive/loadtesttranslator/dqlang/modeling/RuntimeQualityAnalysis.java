package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling;

import io.github.dqualizer.dqlang.types.runtimequalityanalysisdefinition.Monitoring;
import lombok.Getter;
import lombok.ToString;

import java.util.LinkedHashSet;

@Getter
@ToString
public class RuntimeQualityAnalysis {

    private LinkedHashSet<Monitoring> monitoring;
    private LinkedHashSet<Object> resilience;
    private LinkedHashSet<ModeledLoadTest> loadtests;
}
