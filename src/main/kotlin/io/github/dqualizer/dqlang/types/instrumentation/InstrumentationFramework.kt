package io.github.dqualizer.dqlang.types.instrumentation

import com.fasterxml.jackson.annotation.*

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
    val existing: Boolean,
    /**
     * Whether metrics export is enabled for the instrumentation framework
     */
    @JsonProperty("enabled_metrics")
    @JsonPropertyDescription("Whether metrics export is enabled for the instrumentation framework")
    val enabledMetrics: Boolean,
    /**
     * Whether traces export is enabled for the instrumentation framework
     */
    @JsonProperty("enabled_traces")
    @JsonPropertyDescription("Whether traces export is enabled for the instrumentation framework")
    val enabledTraces: Boolean,
    /**
     * Whether log export is enabled for the instrumentation framework
     */
    @JsonProperty("enabled_logs")
    @JsonPropertyDescription("Whether log export is enabled for the instrumentation framework")
    val enabledLogs: Boolean,
    /**
     * Map of options, specific to the instrumentation framework, which should be passed to the agent.
     */
    @JsonProperty("framework_options")
    @JsonPropertyDescription("Map of options, specific to the instrumentation framework, which should be passed to the agent.")
    val frameworkOptions: Map<String, String>
)
