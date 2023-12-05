package io.github.dqualizer.dqlang.types.rqa.definition;


import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.LoadTestDefinition;
import io.github.dqualizer.dqlang.types.rqa.def.monitoring.MonitoringDefinition;
import io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.ResilienceTestDefinition;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class RuntimeQualityAnalysis {
    public Set<LoadTestDefinition> loadtests = new HashSet<>();
    public Set<MonitoringDefinition> monitoringDefinition = new HashSet<>();
    public Set<ResilienceTestDefinition> resilienceTests = new HashSet<>();
}
