package io.github.dqualizer.dqlang.types.adapter.options;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.github.dqualizer.dqlang.types.adapter.k6.Stage;
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
