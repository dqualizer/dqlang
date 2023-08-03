package io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.field

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Input {
    val name: String? = null
    val `in`: String? = null
    val required = false
    val type: String? = null
}
