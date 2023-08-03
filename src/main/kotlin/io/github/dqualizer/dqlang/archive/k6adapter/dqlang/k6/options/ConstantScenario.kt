package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options

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
class ConstantScenario : io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenario() {
    val executor = "constant-vus"
    val vus = 0
    val duration = 0
}
