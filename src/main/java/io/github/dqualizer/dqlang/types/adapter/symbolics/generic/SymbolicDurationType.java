package io.github.dqualizer.dqlang.types.adapter.symbolics.generic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SymbolicDurationType<T> {

    private T slow;
    private T fast;
    @JsonProperty("very_fast")
    private T veryFast;
}
