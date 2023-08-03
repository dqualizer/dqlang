package io.github.dqualizer.dqlang.archive.openapiadapter.dqlang

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class ServerInfo {
    val host: String? = null
    val environment: String? = null
}
