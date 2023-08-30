package io.github.dqualizer.dqlang.types.dam.architecture;

import io.github.dqualizer.dqlang.types.dam.domain.Scenario;
import lombok.Data;

import java.util.List;

@Data
public class Payload {
    private String name;
    private List<Scenario> scenarios;

}
