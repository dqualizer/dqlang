package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Pauses {

    // Pauses in seconds
    @JsonProperty
    private int before;
    @JsonProperty
    private int after;

}