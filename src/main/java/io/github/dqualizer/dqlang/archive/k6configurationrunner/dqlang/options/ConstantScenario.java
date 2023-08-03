package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang.options;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("constant-vus")
public class ConstantScenario extends Scenario {

    private final String executor = "constant-vus";
    private int vus;
    private int duration;
}
