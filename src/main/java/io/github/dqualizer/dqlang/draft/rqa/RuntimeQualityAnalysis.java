package io.github.dqualizer.dqlang.draft.rqa;


import io.github.dqualizer.dqlang.draft.rqa.loadtest.Loadtest;
import io.github.dqualizer.dqlang.draft.rqa.monitoring.Monitoring;
import io.github.dqualizer.dqlang.draft.rqa.resilience.Resilience;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RuntimeQualityAnalysis {
    public List<Loadtest> loadtests = new ArrayList<>();
    public List<Monitoring> monitoring = new ArrayList<>();
    public List<Resilience> resilience = new ArrayList<>();
}
