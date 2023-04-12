package dqualizer.dqlang.archive.k6configurationrunner.dqlang.options;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Stage {

    private String duration;
    private int target;
}