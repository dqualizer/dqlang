package io.github.dqualizer.dqlang.types.adapter.symbolics.generic;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SymbolicLoadType<T> {

    private T low;
    private T medium;
    private T high;
}
