package io.github.dqualizer.dqlang.types.dam;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;
import io.github.dqualizer.dqlang.types.dam.mapping.DAMapping;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class DomainArchitectureMapping extends Identifiable {

    /**
     * technical system description
     */
    @DocumentReference
    private SoftwareSystem softwareSystem;

    @DocumentReference
    private DomainStory domainStory;

    @DocumentReference
    private Set<DAMapping<?, ?>> DAMappings;

    public DomainArchitectureMapping(SoftwareSystem softwareSystem, DomainStory domainStory) {
        this(softwareSystem, domainStory, new HashSet<>());
    }

    @JsonCreator
    public DomainArchitectureMapping(@JsonProperty("software_system") SoftwareSystem softwareSystem,
                                     @JsonProperty("domain_story") DomainStory domainStory,
                                     @JsonProperty("mappings") Set<DAMapping<?, ?>> DAMappings) {
        this.softwareSystem = softwareSystem;
        this.domainStory = domainStory;
        this.DAMappings = DAMappings;
    }
}
