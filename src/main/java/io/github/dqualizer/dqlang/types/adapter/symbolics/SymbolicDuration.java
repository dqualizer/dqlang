package io.github.dqualizer.dqlang.types.adapter.symbolics;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.adapter.symbolics.generic.SymbolicDurationType;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.TimeUnit;

@Getter
@ToString
public class SymbolicDuration {

    private SymbolicDurationType<Integer> integer;
    private SymbolicDurationType<Double> decimal;

    @JsonProperty("time_unit")
    private TimeUnit timeUnit;
}
