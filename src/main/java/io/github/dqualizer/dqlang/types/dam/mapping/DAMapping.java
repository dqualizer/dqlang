package io.github.dqualizer.dqlang.types.dam.mapping;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.DSTElement;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;

public final class DAMapping {
    private final String dst_element_id;

    private final String architecture_element_id;


    @JsonCreator
    public DAMapping(String dst_element_id, String architecture_element_id) {
        this.dst_element_id = dst_element_id;
        this.architecture_element_id = architecture_element_id;
    }

    public DSTElement getDSTEntity(DomainStory domainStory) {
        return domainStory.findElementById(dst_element_id);
    }

    public ArchitectureEntity getArchitectureEntity(SoftwareSystem softwareSystem) {
        return softwareSystem.findEntityById(architecture_element_id);
    }

    @JsonProperty("dst_element_id")
    public String getDstElementId() {
        return dst_element_id;
    }

    @JsonProperty("architecture_element_id")
    public String getArchitectureElementId() {
        return architecture_element_id;
    }
}
