package io.github.dqualizer.dqlang.types.rqa.definition.stimulus

import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile.LoadProfile

data class Workload (
    val type: WorkloadType? = null,

    @JsonProperty("load_profile")
    val loadProfile: LoadProfile? = null
)

