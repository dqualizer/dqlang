package dqualizer.dqlang.archive.k6adapter.dqlang.constants;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ResponseTime {

    private int satisfied;
    private int tolerated;
    private int frustrated;
}