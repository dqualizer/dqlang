package io.github.dqualizer.dqlang.types.rqa.definition.stimulus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DesignParameter {
    private String parameterName;
    private String value;
}
