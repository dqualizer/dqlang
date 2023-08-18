package io.github.dqualizer.dqlang.draft.rqaDefinition;


import io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest.Loadtest;
import io.github.dqualizer.dqlang.draft.rqaDefinition.monitoring.Monitoring;
import io.github.dqualizer.dqlang.draft.rqaDefinition.resilience.Resilience;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RuntimeQualityAnalysis {
    public List<Loadtest> loadtests = new ArrayList<>();
    public List<Monitoring> monitoring = new ArrayList<>();
    public List<Resilience> resilience = new ArrayList<>();
}
