package io.github.dqualizer.dqlang.types.architecture

import com.fasterxml.jackson.annotation.*
import lombok.AllArgsConstructor

/**
 * Runtime Platform
 */
@AllArgsConstructor
data class RuntimePlatform(
    /**
     * Identifier of a platform instance on which a service is running on. This indicator is needed when multiple instances of the same platform are used.
     */
    @JsonProperty("platform_id")
    @JsonPropertyDescription("Identifier of a platform instance on which a service is running on. This indicator is needed when multiple instances of the same platform are used.")
    val platformId: String,

    @JsonProperty("platform_name")
    val platformName: String,

    @JsonProperty("platform_uri")
    val platformUri: String
)
