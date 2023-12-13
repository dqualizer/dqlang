package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Probe {

    @JsonProperty("type")
    String type = "probe";

    @JsonProperty("name")
    String name;

    @JsonProperty("provider")
    Provider provider;

    public Probe(String name, Provider provider) {
        this.name = name;
        this.provider = provider;
    }
}


