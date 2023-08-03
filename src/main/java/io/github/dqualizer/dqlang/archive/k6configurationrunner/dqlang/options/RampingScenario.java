package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.options;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.Stage;
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedHashSet;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("ramping-vus")
public class RampingScenario extends Scenario {

    private final String executor = "ramping-vus";
    private final int startVUs = 0;
    private LinkedHashSet<Stage> stages;
}
