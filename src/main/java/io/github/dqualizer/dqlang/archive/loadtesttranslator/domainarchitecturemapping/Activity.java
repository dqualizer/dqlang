package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.domain_architecture_mapping.Endpoint;
import lombok.Getter;
import lombok.ToString;

import java.util.LinkedHashSet;

@Getter
@ToString
public class Activity {

    @JsonProperty("dq_id")
    private String dqID;
    private String name;
    @JsonProperty("operation_id")
    private String operationID;
    private String type;
    private LinkedHashSet<String> parameter;
    private Endpoint endpoint;
}
