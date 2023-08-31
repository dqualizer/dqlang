package io.github.dqualizer.dqlang.types.dam.architecture;

import lombok.Data;

import java.util.Set;

@Data
public class ResponseDescription {
    private Set<Integer> expected_codes;
    private String format;
}
