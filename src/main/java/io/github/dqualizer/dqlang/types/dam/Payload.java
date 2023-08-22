package io.github.dqualizer.dqlang.types.dam;

import lombok.Data;

import java.util.List;

@Data
public class Payload {
    private String name;
    private List<Scenario> szenarios;

}
