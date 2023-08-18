package io.github.dqualizer.dqlang.types.instrumentation

data class MonitoringConfiguration(
    val serviceMonitoringConfigurations: Collection<ServiceMonitoringConfiguration>,
    val serviceMonitoringFrameworks: Map<String, InstrumentationFramework>
)
