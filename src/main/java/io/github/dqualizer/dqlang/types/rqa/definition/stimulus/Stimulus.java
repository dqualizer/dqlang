package io.github.dqualizer.dqlang.types.rqa.definition.stimulus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stimulus {

    private Workload workload;
    private int accuracy;

}
