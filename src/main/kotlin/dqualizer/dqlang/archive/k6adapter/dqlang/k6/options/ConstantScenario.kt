package dqualizer.dqlang.archive.k6adapter.dqlang.k6.options

import com.fasterxml.jackson.annotation.JsonTypeName
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
