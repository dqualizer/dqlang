package io.github.dqualizer.dqlang.draft.rqaDefinition.loadtest.stimulus;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.draft.rqaDefinition.enums.TypeOfIncrease;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoadIncreaseStimulus extends Stimulus {
    @JsonProperty("type_of_increase")
    private TypeOfIncrease typeOfIncrease;
}
