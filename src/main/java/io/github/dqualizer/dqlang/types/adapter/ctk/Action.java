package io.github.dqualizer.dqlang.types.adapter.ctk;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Action extends Probe{

    @JsonProperty("type")
    String type = "Action";

    public Action(String name, Provider provider) {
        super(name, provider);
    }
}
