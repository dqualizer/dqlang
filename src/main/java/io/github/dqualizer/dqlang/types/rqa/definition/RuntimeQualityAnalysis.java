package io.github.dqualizer.dqlang.types.rqa.definition;


import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.LoadTestDefinition;
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.MonitoringDefinition;
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.ResilienceDefinition;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Builder
public class RuntimeQualityAnalysis {
    private final Set<LoadTestDefinition> loadtests = new HashSet<>();
    private final Set<MonitoringDefinition> monitoringDefinition = new HashSet<>();
    private final Set<ResilienceDefinition> resilienceDefinition = new HashSet<>();
}
