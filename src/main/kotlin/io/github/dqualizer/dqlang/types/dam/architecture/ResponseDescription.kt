package io.github.dqualizer.dqlang.types.dam.architecture

import com.fasterxml.jackson.annotation.JsonProperty


data class ResponseDescription(
    private val format: String,
    @JsonProperty("expected_codes")
    private val expectedCodes: Set<Int> = emptySet()
)