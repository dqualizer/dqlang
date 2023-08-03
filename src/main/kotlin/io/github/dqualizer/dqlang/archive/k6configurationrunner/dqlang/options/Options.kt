package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.options

import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenarios
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Options {
    val scenarios: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenarios? = null
}
