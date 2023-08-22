package io.github.dqualizer.dqlang.types.rqa.definition;


import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.ModeledLoadTest;
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.Monitoring;
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.Resilience;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RuntimeQualityAnalysis {
    public List<ModeledLoadTest> loadtests = new ArrayList<>();
    public List<Monitoring> monitoring = new ArrayList<>();
    public List<Resilience> resilience = new ArrayList<>();
}
