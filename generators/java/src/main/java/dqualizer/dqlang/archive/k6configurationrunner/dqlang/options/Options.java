package dqualizer.dqlang.archive.k6configurationrunner.dqlang.options;

import dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Scenarios;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Options {

    private Scenarios scenarios;
}