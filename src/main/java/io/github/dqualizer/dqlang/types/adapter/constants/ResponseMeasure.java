package io.github.dqualizer.dqlang.types.adapter.constants;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponseMeasure {

    private int satisfied;
    private int tolerated;
    private int frustrated;
}