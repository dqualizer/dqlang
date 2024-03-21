package io.github.dqualizer.dqlang.types.dam.architecture.apischema;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServerInfo {

    private String host;
    private String environment;
}
