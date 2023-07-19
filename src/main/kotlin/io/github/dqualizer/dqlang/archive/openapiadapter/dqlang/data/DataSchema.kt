package io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.data

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class DataSchema {
    private val type: String? = null
    private val properties: LinkedHashSet<io.github.dqualizer.dqlang.archive.openapiadapter.dqlang.data.Property>? = null
}
