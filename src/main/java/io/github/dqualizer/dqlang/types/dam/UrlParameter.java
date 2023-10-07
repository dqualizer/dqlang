package io.github.dqualizer.dqlang.types.dam;

import lombok.Data;

import java.util.List;

@Data
public class UrlParameter {
    private String name;
    private List<Scenario> scenarios;
}
