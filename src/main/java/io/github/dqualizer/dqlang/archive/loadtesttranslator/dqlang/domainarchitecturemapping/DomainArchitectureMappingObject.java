package io.github.dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.LinkedHashSet;

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
    private LinkedHashSet<String> implementations;
    private LinkedHashSet<String> objects;
    private LinkedHashSet<Activity> activities;
}
