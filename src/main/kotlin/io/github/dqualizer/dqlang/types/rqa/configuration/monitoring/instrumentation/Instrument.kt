package io.github.dqualizer.dqlang.types.rqa.configuration.monitoring.instrumentation

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
    val measurementName: String,

    @JsonProperty("instrument_name")
    val instrumentName: String,

    @JsonProperty("instrument_type")
    val instrumentType: InstrumentType,

    @JsonProperty("measurement_type")
    val measurementType: MeasurementType,

    @JsonProperty("measurement_unit")
    val measurementUnit: String,

    @JsonProperty("target_component_id")
    val targetComponentId: String,

    @JsonProperty("buckets")
    @JsonPropertyDescription("The buckets of a histogram. The buckets are defined as a list of upper bounds. The first bucket is always 0, the last bucket is always infinity. Only relevant if the measurement type is a histogram.")
    //TODO: Default buckets should be defined like in opentelemetry (exponentially distributed, e.g. 2^n)
    val histogramBuckets: List<Double> = listOf(1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 128.0, 256.0, 512.0, 1024.0),

    /**
     * Instrumentation Location
     *
     * <p>
     * Location where an instrument should be placed. The location can specify a file and a method or class name.
     */
    @JsonPropertyDescription("Location where an instrument should be placed. The location can specify a file and a method or class name.")
    val location: InstrumentLocation
)
