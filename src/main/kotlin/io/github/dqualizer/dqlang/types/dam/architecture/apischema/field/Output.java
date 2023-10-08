package io.github.dqualizer.dqlang.types.dam.architecture.apischema.field;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Output {

    private String type;
    @JsonProperty("expected_code")
    private String expectedCode;
}
