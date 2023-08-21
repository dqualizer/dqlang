package io.github.dqualizer.dqlang.types_new.adapter.options;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "executor")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ConstantScenario.class, name = "constant-vus"),
        @JsonSubTypes.Type(value = RampingScenario.class, name = "ramping-vus")
})
public abstract class Scenario {
}
