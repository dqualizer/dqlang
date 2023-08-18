package io.github.dqualizer.dqlang.draft.dam;

import lombok.Data;

import java.util.List;

@Data
public class PathVariable {
    public String name;
    public List<Scenario> scenarios;
}
