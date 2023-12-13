package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Provider {

    @JsonProperty("type")
    String type;

    @JsonProperty("module")
    String module;

    @JsonProperty("func")
    String function;

    @JsonProperty("arguments")
    Map<String, Object> arguments;
}
