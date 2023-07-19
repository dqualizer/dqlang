package io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.data

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Property {
    private val name: String? = null
    private val type: String? = null
}
