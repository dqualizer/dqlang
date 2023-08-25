package io.github.dqualizer.dqlang.types.rqa.definition;


import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.ModeledLoadTest;
import io.github.dqualizer.dqlang.types.rqa.def.monitoring.Monitoring;
import io.github.dqualizer.dqlang.types.rqa.def.resilience.Resilience;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class RuntimeQualityAnalysis {
    public Set<ModeledLoadTest> loadtests = new HashSet<>();
    public Set<Monitoring> monitoring = new HashSet<>();
    public Set<Resilience> resilience = new HashSet<>();
}
