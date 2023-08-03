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
    val type: String? = null

    @JsonProperty("expected_code")
    val expectedCode: String? = null
}
