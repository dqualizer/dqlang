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
    val name: String? = null
    val type: String? = null
}
