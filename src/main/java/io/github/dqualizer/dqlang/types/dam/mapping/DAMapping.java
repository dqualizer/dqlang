package io.github.dqualizer.dqlang.types.dam.mapping;

import io.github.dqualizer.dqlang.types.dam.Identifiable;
import io.github.dqualizer.dqlang.types.dam.architecture.ArchitectureEntity;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.DSTEntity;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public abstract class DAMapping<S extends DSTEntity, D extends ArchitectureEntity> extends Identifiable {

    public abstract S getSource();

    public abstract D getDestination(DomainStory story, SoftwareSystem system);

}
