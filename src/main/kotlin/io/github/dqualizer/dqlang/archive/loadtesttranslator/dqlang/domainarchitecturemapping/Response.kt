package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class Response {
    @JsonProperty("expected_code")
    private val expectedCode = 0
    private val type: String? = null
}
