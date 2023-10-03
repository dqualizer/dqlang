package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription

/**
 * InstrumentationFrameworkDescription
 *
 *
 * A generic description of an instrumentation framework.
 *
 */

data class InstrumentationFramework(
    /**
     * The name of the instrumentation framework
     */
    @JsonPropertyDescription("The name of the instrumentation framework")
    val name: String,

    /**
     * Whether the instrumentation framework is already installed
     */
    @JsonPropertyDescription("Whether the instrumentation framework is already installed")
    val existing: Boolean = false,

    /**
     * Whether metrics export is enabled for the instrumentation framework
     */
    @JsonProperty("has_metrics")
    @JsonPropertyDescription("Whether metrics export is enabled for the instrumentation framework")
    val hasMetrics: Boolean = false,

    /**
     * Whether traces export is enabled for the instrumentation framework
     */
    @JsonProperty("has_traces")
    @JsonPropertyDescription("Whether traces export is enabled for the instrumentation framework")
    val hasTraces: Boolean = false,

    /**
     * Whether log export is enabled for the instrumentation framework
     */
    @JsonProperty("has_logging")
    @JsonPropertyDescription("Whether log export is enabled for the instrumentation framework")
    val hasLogging: Boolean = false,

    /**
     * Map of options, specific to the instrumentation framework, which should be passed to the agent.
     */
    @JsonProperty("options")
    @JsonPropertyDescription("Map of options, specific to the instrumentation framework, which should be passed to the agent.")
    val options: Map<String, String> = mutableMapOf()
)
