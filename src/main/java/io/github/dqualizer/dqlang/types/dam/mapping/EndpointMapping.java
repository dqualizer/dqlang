package io.github.dqualizer.dqlang.types.dam.mapping;

import io.github.dqualizer.dqlang.types.dam.architecture.RESTEndpoint;
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

/**
 * @author Lion Wagner
 */
@Data
@Document
public class EndpointMapping extends Mapping<Actor, RESTEndpoint> {

    @DocumentReference
    private final Actor actor;

    @DocumentReference
    private final RESTEndpoint endpoint;

    @Override
    public Actor getSource() {
        return getActor();
    }

    @Override
    public RESTEndpoint getDestination() {
        return getEndpoint();
    }
}
