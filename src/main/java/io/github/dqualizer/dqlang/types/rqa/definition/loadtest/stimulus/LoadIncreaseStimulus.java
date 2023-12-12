package io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.TypeOfIncrease;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class LoadIncreaseStimulus extends LoadStimulus {
    @JsonProperty("type_of_increase")
    private TypeOfIncrease typeOfIncrease;
}
