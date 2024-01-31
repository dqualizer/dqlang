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
public class Credential {

    // In CTK secrets can be of different types e.g. secrets which are accessed from the execution environment (terminal)
    @JsonProperty("type")
    private String type;

    // Key which is used to get credential's value from the execution environment
    @JsonProperty("key")
    private String environmentKey;
}
