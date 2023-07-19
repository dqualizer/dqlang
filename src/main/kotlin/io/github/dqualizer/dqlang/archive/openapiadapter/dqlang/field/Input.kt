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
    private val name: String? = null
    private val `in`: String? = null
    private val required = false
    private val type: String? = null
}
