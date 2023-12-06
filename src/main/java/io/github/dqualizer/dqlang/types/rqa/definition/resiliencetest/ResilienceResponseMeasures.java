package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Satisfaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResilienceResponseMeasures {

    @JsonProperty("recovery_time")
    private Satisfaction recoveryTime;
}
