package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic.SymbolicValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
public class LoadPeak extends LoadProfile {

    /**
     * Type identifier for JSON serialization.
     */
    public static final String TYPE_IDENTIFIER = "peak";

    @JsonProperty("peak_load")
    private SymbolicValue peakLoad;
    private SymbolicValue duration;
}
