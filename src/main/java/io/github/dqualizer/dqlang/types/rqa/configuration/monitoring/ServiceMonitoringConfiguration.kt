package io.github.dqualizer.dqlang.types.rqa.configuration.monitoring

import io.github.dqualizer.dqlang.types.dam.instrumentation.Instrument
import io.github.dqualizer.dqlang.types.dam.instrumentation.InstrumentationFramework

data class ServiceMonitoringConfiguration(
    val serviceID: String,
    val instrumentations: List<Instrument>,
    val framework: InstrumentationFramework
)
