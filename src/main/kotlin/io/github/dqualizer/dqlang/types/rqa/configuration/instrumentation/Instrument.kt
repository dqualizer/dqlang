package io.github.dqualizer.dqlang.types.rqa.configuration.instrumentation

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.MeasurementType


/**
 * Instrument
 *
 *
 *
 *
 */

class Instrument(
    @JsonProperty("metric_labels")
    val metricTags: Map<String, String> = mutableMapOf(),

    @JsonProperty("metric_name")
    val metricName: String,

    @JsonProperty("instrument_name")
    val instrumentName: String,

    @JsonProperty("instrument_type")
    val instrumentType: InstrumentType,

    @JsonProperty("measurement_type")
    val measurementType: MeasurementType,


    @JsonProperty("measurement_unit")
    val measurementUnit: String,

    /**
     * Instrumentation Location
     *
     * <p>
     * Location where an instrument should be placed. The location can specify a file and a method or class name.
     */
    @JsonPropertyDescription("Location where an instrument should be placed. The location can specify a file and a method or class name.")
    val location: InstrumentLocation
)
