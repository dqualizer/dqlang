package io.github.dqualizer.dqlang.types.rqa.configuration.monitoring

data class MonitoringConfiguration(
    val serviceMonitoringConfigurations: Collection<ServiceMonitoringConfiguration> = listOf(),
)
