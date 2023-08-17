package io.github.dqualizer.dqlang.types.instrumentation

data class ServiceMonitoringConfiguration(
    val serviceID: String,
    val instrumentations: List<Instrument>,
    val framework: InstrumentationFramework
)
