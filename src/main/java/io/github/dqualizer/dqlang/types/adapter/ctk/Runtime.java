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
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Runtime {
    @JsonProperty("rollbacks")
    private Strategy rollbacksStrategy;
    @JsonProperty("hypothesis")
    private Strategy hypothesisStrategy;

    public void setRollbacksStrategy(Strategy rollbacksStrategy) {
        this.rollbacksStrategy = rollbacksStrategy;
    }

    public void setHypothesisStrategy(Strategy hypothesisStrategy) {
        this.hypothesisStrategy = hypothesisStrategy;
    }
}


