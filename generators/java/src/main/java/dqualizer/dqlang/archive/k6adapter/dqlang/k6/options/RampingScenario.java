package dqualizer.dqlang.archive.k6adapter.dqlang.k6.options;

import com.fasterxml.jackson.annotation.JsonTypeName;
import dqualizer.dqlang.archive.k6adapter.dqlang.k6.Stage;
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