package io.github.dqualizer.dqlang.types.dam;

import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;
import io.github.dqualizer.dqlang.types.dam.mapping.MappingCollection;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@EqualsAndHashCode(callSuper = true)
@Document
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
    private final MappingCollection mappingCollection;
}
