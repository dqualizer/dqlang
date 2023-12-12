package io.github.dqualizer.dqlang.types.adapter.ctk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

/**
 * Java class for k6 loadtest configurations
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CtkConfiguration {

    private String name;
    private Set<CtkChaosExperiment> ctkChaosExperiments;
}
