package io.github.dqualizer.dqlang.types.dam.domainstory;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Lion Wagner
 */
@Data
@Document
public final class Group implements Actor{

    private final String id;
    private final String name;
    private final ActorType type = ActorType.GROUP;
}
