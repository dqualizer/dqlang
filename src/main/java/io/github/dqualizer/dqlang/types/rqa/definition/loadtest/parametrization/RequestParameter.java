package io.github.dqualizer.dqlang.types.rqa.definition.loadtest.parametrization;

import lombok.Data;

import java.util.List;

@Data
public class RequestParameter {
    public String name;
    public List<Scenario> scenarios;
}
