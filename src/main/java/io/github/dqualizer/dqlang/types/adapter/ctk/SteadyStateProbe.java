package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SteadyStateProbe extends Probe{

    @JsonProperty("tolerance")
    JsonNode tolerance;

    public SteadyStateProbe(String name, Provider provider, JsonNode tolerance) {
        super(name, provider);
        this.tolerance = tolerance;
    }
}
