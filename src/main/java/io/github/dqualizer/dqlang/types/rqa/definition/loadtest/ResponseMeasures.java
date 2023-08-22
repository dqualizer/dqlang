package io.github.dqualizer.dqlang.types.rqa.definition.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.ResponseTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMeasures {
    @JsonProperty("response_time")
    private ResponseTime responseTime;
}
