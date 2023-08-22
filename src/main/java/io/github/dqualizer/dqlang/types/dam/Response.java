package io.github.dqualizer.dqlang.types.dam;

import lombok.Data;

@Data
public class Response {
    private int expected_code;
    private String type;
}
