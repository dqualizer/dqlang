package io.github.dqualizer.dqlang.types.rqa.configuration.monitoring

import io.github.dqualizer.dqlang.types.dam.architecture.InstrumentationFramework

data class MonitoringConfiguration(
    val serviceMonitoringConfigurations: Collection<ServiceMonitoringConfiguration>,
    val serviceMonitoringFrameworks: Map<String, InstrumentationFramework>
)
