package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6

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
