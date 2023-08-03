package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.options

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Stage {
    val duration: String? = null
    val target = 0
}
