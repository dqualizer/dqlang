package io.github.dqualizer.dqlang.types.dam;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.dqualizer.dqlang.data.ComplexStorable;
import io.github.dqualizer.dqlang.data.DqualizerRepositories;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;
import io.github.dqualizer.dqlang.types.dam.mapping.DAMapper;
import io.github.dqualizer.dqlang.types.dam.mapping.DAMapping;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.PersistenceCreator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.HashSet;
import java.util.Set;


@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Document
public class DomainArchitectureMapping
        extends Identifiable
        implements ComplexStorable<DomainArchitectureMapping> {

    /**
     * technical system description
     */
    @DocumentReference
    private SoftwareSystem softwareSystem;

    @DocumentReference
    private DomainStory domainStory;

    @JsonProperty("mappings")
    private Set<DAMapping> DAMappings;

    public DomainArchitectureMapping(SoftwareSystem softwareSystem, DomainStory domainStory) {
        this(softwareSystem, domainStory, new HashSet<>());
    }


    @PersistenceCreator
    @JsonCreator
    public DomainArchitectureMapping(@JsonProperty("software_system") SoftwareSystem softwareSystem,
                                     @JsonProperty("domain_story") DomainStory domainStory,
                                     @JsonProperty("mappings") Set<DAMapping> DAMappings) {
        this.softwareSystem = softwareSystem;
        this.domainStory = domainStory;
        this.DAMappings = DAMappings;
    }

    @JsonIgnore
    public DAMapper getMapper() {
        return new DAMapper(this, false);
    }

    @JsonIgnore
    public DAMapper getMapper(boolean lazy) {
        return new DAMapper(this, lazy);
    }

    @Override
    public DomainArchitectureMapping store(@NotNull DqualizerRepositories repositories) {

        softwareSystem.store(repositories);
        domainStory.store(repositories);

        DomainArchitectureMapping saved = repositories.getDamRepository().save(this);
        this.setId(saved.getId());

        return this;
    }
}
