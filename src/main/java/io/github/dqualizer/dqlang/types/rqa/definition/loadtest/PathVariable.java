package io.github.dqualizer.dqlang.types.rqa.definition.loadtest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PathVariable {
    private Map<String, String> variables = new HashMap<>();
}
