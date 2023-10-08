package io.github.dqualizer.dqlang.types.rqa.definition.loadtest.parametrization;

import lombok.Data;

import java.util.List;

@Data
public class UrlParameter {
    private String name;
    private List<Scenario> scenarios;
}
