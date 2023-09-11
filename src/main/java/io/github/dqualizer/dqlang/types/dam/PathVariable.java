package io.github.dqualizer.dqlang.types.dam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PathVariable {
    public String name;
    public List<Scenario> scenarios;
}
