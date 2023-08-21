package io.github.dqualizer.dqlang.types_new.adapter.constants;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponseTime {

    private int satisfied;
    private int tolerated;
    private int frustrated;
}
