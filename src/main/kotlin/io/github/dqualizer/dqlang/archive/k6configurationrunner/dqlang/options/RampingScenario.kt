package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.options

import com.fasterxml.jackson.annotation.JsonTypeName
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.Stage
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenario
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("ramping-vus")
class RampingScenario : io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenario() {
    private val executor = "ramping-vus"
    private val startVUs = 0
    private val stages: LinkedHashSet<io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.Stage>? = null
}