package io.github.dqualizer.dqlang.types_new.adapter.constants.loadprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoadIncrease {

    @JsonProperty("start_target")
    private int startTarget;
    @JsonProperty("end_target")
    private int endTarget;
    @JsonProperty("stages")
    private int stages;
    @JsonProperty("test_duration")
    private String testDuration;
    private int linear;
    private int quadratic;
    private int cubic;
}
