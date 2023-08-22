package io.github.dqualizer.dqlang.types.dam;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@ToString
public class DomainArchitectureMappingObject {

    @JsonProperty("dq_id")
    private String dqID;
    private String name;
    @JsonProperty("operation_id")
    private String operationID;
    private String type;
    @JsonProperty("implements")
    private Set<String> implementations;
    private Set<String> objects;
    private Set<Activity> activities;
}
