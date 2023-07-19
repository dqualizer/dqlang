package dqualizer.dqlang.archive.k6configurationrunner.dqlang.options

import com.fasterxml.jackson.annotation.JsonTypeName
import dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenario
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("constant-vus")
class ConstantScenario : Scenario() {
    private val executor = "constant-vus"
    private val vus = 0
    private val duration = 0
}
