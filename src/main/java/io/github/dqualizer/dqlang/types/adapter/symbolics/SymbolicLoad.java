package io.github.dqualizer.dqlang.types.adapter.symbolics;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.adapter.symbolics.generic.SymbolicLoadType;
import lombok.Getter;
import lombok.ToString;

import java.util.concurrent.TimeUnit;

@Getter
@ToString
public class SymbolicLoad {

    private SymbolicLoadType<Integer> integer;
    private SymbolicLoadType<Double> decimal;

    /**
     * TimeUnit for open loads,
     * @example users per SECONDS, users per MINUTES
     */
    @JsonProperty("time_unit")
    private TimeUnit timeUnit;
}
