package io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Output {
    private val type: String? = null

    @JsonProperty("expected_code")
    private val expectedCode: String? = null
}
