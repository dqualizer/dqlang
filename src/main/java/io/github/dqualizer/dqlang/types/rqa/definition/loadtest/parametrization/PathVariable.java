package io.github.dqualizer.dqlang.types.rqa.definition.loadtest.parametrization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PathVariable {
    public String name;
    public List<Scenario> scenarios;
}
