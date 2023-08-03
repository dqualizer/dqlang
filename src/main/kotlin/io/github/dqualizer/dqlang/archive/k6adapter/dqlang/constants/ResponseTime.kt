package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants

import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ResponseTime {
    val satisfied = 0
    val tolerated = 0
    val frustrated = 0
}
