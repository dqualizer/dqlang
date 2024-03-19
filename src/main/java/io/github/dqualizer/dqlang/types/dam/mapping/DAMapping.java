package io.github.dqualizer.dqlang.types.dam.mapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.DSTElement;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;

import java.util.Optional;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes(
        value = {
                @JsonSubTypes.Type(value = ActivityToCallMapping.class, name = "ActivityToCallMapping"),
                @JsonSubTypes.Type(value = WorkObjectToTypeMapping.class, name = "WorkObjectToTypeMapping"),
                @JsonSubTypes.Type(value = ValueObjectToTypeMapping.class, name = "ValueObjectToTypeMapping"),
                @JsonSubTypes.Type(value = ActorMapping.class, name = "ActorMapping")
        }

)
public class DAMapping {
    private final String dstElementId;

    private final String architectureElementId;

    public DAMapping(String dstElementId, String architectureElementId) {
        this.dstElementId = dstElementId;
        this.architectureElementId = architectureElementId;
    }

    public DSTElement getDSTEntity(DomainStory domainStory) {
        return domainStory.findElementById(dstElementId);
    }

    public Optional<ArchitectureEntity> getArchitectureEntity(SoftwareSystem softwareSystem) {
        return softwareSystem.findArchitectureEntity(architectureElementId);
    }

    @JsonProperty("dst_element_id")
    public String getDstElementId() {
        return dstElementId;
    }

    @JsonProperty("architecture_element_id")
    public String getArchitectureElementId() {
        return architectureElementId;
    }
}
