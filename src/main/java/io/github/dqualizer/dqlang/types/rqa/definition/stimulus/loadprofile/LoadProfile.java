package io.github.dqualizer.dqlang.types.rqa.definition.stimulus.loadprofile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.symbolic.SymbolicValue;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(value = {
        @JsonSubTypes.Type(name = LoadIncrease.TYPE_IDENTIFIER, value = LoadIncrease.class),
        @JsonSubTypes.Type(name = LoadPeak.TYPE_IDENTIFIER, value = LoadPeak.class),
        @JsonSubTypes.Type(name = ConstantLoad.TYPE_IDENTIFIER, value = ConstantLoad.class),
})
public abstract class LoadProfile {

    @JsonProperty("base_load")
    SymbolicValue baseLoad;
}
