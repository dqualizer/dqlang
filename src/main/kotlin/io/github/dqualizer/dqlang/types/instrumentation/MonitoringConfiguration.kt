package io.github.dqualizer.dqlang.types.instrumentation

data class MonitoringConfiguration(
    val instrumentations: List<Instrument>,
    val framework: InstrumentationFramework
)
