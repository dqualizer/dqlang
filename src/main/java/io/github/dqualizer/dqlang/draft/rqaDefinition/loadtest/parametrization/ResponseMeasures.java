package io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest.parametrization;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.draft.rqaDefinition.enums.ResponseTime;
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
