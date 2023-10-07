package io.github.dqualizer.dqlang.types.rqa.definition.stimulus;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.BaseLoad;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.TypeOfIncrease;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConstantLoadStimulus extends Stimulus{
    @JsonProperty("base_load")
    private BaseLoad baseLoad;
}
