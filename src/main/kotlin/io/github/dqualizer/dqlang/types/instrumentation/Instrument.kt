package io.github.dqualizer.dqlang.types.instrumentation

import com.fasterxml.jackson.annotation.*


/**
 * Instrument
 *
 *
 *
 *
 */

class Instrument(
    @JsonProperty("metric_labels")
    val metricLabels: MutableList<String> = ArrayList(),

    @JsonProperty("metric_name")
    val metricName: String,

    @JsonProperty("instrument_name")
    val instrumentName: String,

    @JsonProperty("instrument_type")
    val instrumentType: InstrumentType,

    /**
     * Instrumentation Location
     *
     * <p>
     * Location where an instrument should be placed. The location can specify a file and a method or class name.
     */
    @JsonPropertyDescription("Location where an instrument should be placed. The location can specify a file and a method or class name.")
    val location: InstrumentationLocation
)
