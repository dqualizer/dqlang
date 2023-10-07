package io.github.dqualizer.dqlang.types.rqa.definition;


import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.LoadTestDefinition;
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.MonitoringDefinition;
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.ResilienceDefinition;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class RuntimeQualityAnalysis {
    public Set<LoadTestDefinition> loadtests = new HashSet<>();
    public Set<MonitoringDefinition> monitoringDefinition = new HashSet<>();
    public Set<ResilienceDefinition> resilienceDefinition = new HashSet<>();
}
