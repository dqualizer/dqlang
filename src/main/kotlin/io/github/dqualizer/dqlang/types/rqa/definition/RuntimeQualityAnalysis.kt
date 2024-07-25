package io.github.dqualizer.dqlang.types.rqa.definition

import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.LoadTestDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.MonitoringDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.ResilienceTestDefinition

data class RuntimeQualityAnalysis(
  val loadTestDefinition: MutableSet<LoadTestDefinition> = HashSet(),
  val monitoringDefinition: MutableSet<MonitoringDefinition> = HashSet(),
  val resilienceTestDefinition: MutableSet<ResilienceTestDefinition> = HashSet()
)



