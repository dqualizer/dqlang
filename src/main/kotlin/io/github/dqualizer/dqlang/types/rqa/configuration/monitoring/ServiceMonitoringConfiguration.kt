package io.github.dqualizer.dqlang.types.rqa.configuration.monitoring

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.dam.architecture.InstrumentationFramework
import io.github.dqualizer.dqlang.types.rqa.configuration.monitoring.instrumentation.Instrument
import lombok.Builder

@Builder
data class ServiceMonitoringConfiguration(
    @JsonProperty("service_id")
    val serviceID: String,

    @JsonProperty("instruments")
    val instruments: Set<Instrument>,

    @JsonProperty("instrumentation_framework")
    val instrumentationFramework: InstrumentationFramework
)
