package io.github.dqualizer.dqlang.types.dam.mapping;

import io.github.dqualizer.dqlang.types.dam.architecture.Endpoint;
import io.github.dqualizer.dqlang.types.dam.domainstory.Activity;
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

/**
 * @author Lion Wagner
 */
@Data
@Document
public class EndpointMapping {

    @Id
    private final String id;

    @DBRef
    private final Actor actor;

    private final Endpoint endpoint;

}
