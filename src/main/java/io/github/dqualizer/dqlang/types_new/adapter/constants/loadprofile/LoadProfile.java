package io.github.dqualizer.dqlang.types_new.adapter.constants.loadprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoadProfile {

    @JsonProperty("load_peak")
    private LoadPeak loadPeak;
    @JsonProperty("load_increase")
    private LoadIncrease loadIncrease;
    @JsonProperty("constant_load")
    private ConstantLoad constantLoad;
}
