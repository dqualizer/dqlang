package io.github.dqualizer.dqlang.types_new.adapter.k6;

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
