package io.github.dqualizer.dqlang.types.rqa.definition

import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.LoadTestDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.MonitoringDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.ResilienceDefinition

data class RuntimeQualityAnalysis(
    val loadTestDefinition: Set<LoadTestDefinition> = HashSet(),
    val monitoringDefinition: Set<MonitoringDefinition> = HashSet(),
    val resilienceDefinition: Set<ResilienceDefinition> = HashSet()
)



