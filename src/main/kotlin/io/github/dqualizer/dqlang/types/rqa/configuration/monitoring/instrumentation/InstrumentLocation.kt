package io.github.dqualizer.dqlang.types.rqa.configuration.monitoring.instrumentation

import com.fasterxml.jackson.annotation.JsonPropertyDescription

/**
 * Instrumentation Location
 *
 *
 * Location where an instrument should be placed. The location can specify a file and a method or class name.
 *
 */

data class InstrumentLocation(
    /**
     * File that should be instrumented.
     */
    @JsonPropertyDescription("File that should be instrumented.")
    val file: String,
    /**
     * Method or class Name.
     */
    @JsonPropertyDescription("Method or class Name.")
    val location: String
)
