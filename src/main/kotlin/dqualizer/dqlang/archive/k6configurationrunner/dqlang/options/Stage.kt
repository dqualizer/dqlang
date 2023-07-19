package dqualizer.dqlang.archive.k6configurationrunner.dqlang.options

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Stage {
    private val duration: String? = null
    private val target = 0
}
