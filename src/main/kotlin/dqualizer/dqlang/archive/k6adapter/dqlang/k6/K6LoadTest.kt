package dqualizer.dqlang.archive.k6adapter.dqlang.k6

import dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Options
import dqualizer.dqlang.archive.k6adapter.dqlang.k6.request.Request
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class K6LoadTest {
    private val repetition = 0
    private val options: Options? = null
    private val request: Request? = null
}
