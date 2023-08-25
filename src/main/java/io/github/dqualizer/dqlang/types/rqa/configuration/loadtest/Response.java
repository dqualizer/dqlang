package io.github.dqualizer.dqlang.types.rqa.configuration.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Response {

    @JsonProperty("expected_code")
    private int expectedCode;
    private String type;
}
