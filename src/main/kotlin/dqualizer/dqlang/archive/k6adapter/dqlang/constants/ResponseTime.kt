package dqualizer.dqlang.archive.k6adapter.dqlang.constants

import lombok.Getter
import lombok.ToString

@Getter
@ToString
class ResponseTime {
    private val satisfied = 0
    private val tolerated = 0
    private val frustrated = 0
}
