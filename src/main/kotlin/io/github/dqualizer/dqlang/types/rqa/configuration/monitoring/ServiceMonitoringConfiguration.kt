package io.github.dqualizer.dqlang.types.rqa.configuration.monitoring

import io.github.dqualizer.dqlang.types.dam.architecture.InstrumentationFramework
import io.github.dqualizer.dqlang.types.rqa.configuration.instrumentation.Instrument

data class ServiceMonitoringConfiguration(
    val serviceID: String,
    val instruments: List<Instrument>,
    val framework: InstrumentationFramework
)
