package dqualizer.dqlang.archive.k6adapter.dqlang.k6.options

import com.fasterxml.jackson.annotation.JsonTypeName
import dqualizer.dqlang.archive.k6adapter.dqlang.k6.Stage
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("ramping-vus")
class RampingScenario : Scenario() {
    private val executor = "ramping-vus"
    private val startVUs = 0
    private val stages: LinkedHashSet<Stage>? = null
}
