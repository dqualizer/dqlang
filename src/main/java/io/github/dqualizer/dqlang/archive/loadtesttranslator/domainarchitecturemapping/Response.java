package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping;

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
