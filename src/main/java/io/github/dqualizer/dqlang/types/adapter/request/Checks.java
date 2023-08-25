package io.github.dqualizer.dqlang.types.adapter.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Checks {

    @JsonProperty("status_codes")
    private Set<Integer> statusCodes;
    @JsonProperty("duration")
    private int duration;
}
