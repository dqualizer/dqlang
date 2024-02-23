package io.github.dqualizer.dqlang.types.adapter.ctk;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Action extends Probe{

    @JsonProperty(value = "type", required = true)
    String type = "action";
    @JsonProperty(value = "pauses", required = false)
    Pauses pauses;

    public Action(String name, Provider provider) {
        super(name, provider);
    }

    public Action(String name, Provider provider, Pauses pauses) {
        super(name, provider);
        this.pauses = pauses;
    }
}
