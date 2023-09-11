package io.github.dqualizer.dqlang.types.dam;

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
    private final SoftwareSystem softwareSystem;

    @DocumentReference
    private final DomainStory domainStory;

    @DocumentReference
    private final Set<DAMapping<?, ?>> DAMappings = new HashSet<>();
}
