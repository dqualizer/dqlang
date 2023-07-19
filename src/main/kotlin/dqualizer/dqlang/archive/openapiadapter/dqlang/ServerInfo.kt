package dqualizer.dqlang.archive.openapiadapter.dqlang

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class ServerInfo {
    private val host: String? = null
    private val environment: String? = null
}
