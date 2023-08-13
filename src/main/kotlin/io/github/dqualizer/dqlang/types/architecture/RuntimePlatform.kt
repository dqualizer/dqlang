package io.github.dqualizer.dqlang.types.architecture

import com.fasterxml.jackson.annotation.*
import java.util.*

/**
 * Runtime Platform
 */

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
    @JsonPropertyDescription("URI to access the platform. e.g. via ssh")
    val platformUri: String?,

    @JsonProperty("platform_settings")
    @JsonPropertyDescription("Setting variables that can be passed to the platform accessor. e.g. DOCKER_TLS_VERIFY: 'true'")
    val platformSettings: Map<String, String> = Collections.emptyMap()
)
