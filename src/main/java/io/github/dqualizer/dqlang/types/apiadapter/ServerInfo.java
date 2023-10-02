package io.github.dqualizer.dqlang.types.apiadapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ServerInfo {

    private String host;
    private String environment;
}
