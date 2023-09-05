package io.github.dqualizer.dqlang.types.dam.mapping;

import io.github.dqualizer.dqlang.types.dam.architecture.RESTEndpoint;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

/**
 * @author Lion Wagner
 */
@Document
public class EndpointMapping extends Mapping<Actor, RESTEndpoint> {

    @DocumentReference
    private final Actor actor;

    @DocumentReference
    private final RESTEndpoint endpoint;

    public EndpointMapping(Actor actor, RESTEndpoint endpoint) {
        this.actor = actor;
        this.endpoint = endpoint;
    }

    @Override
    public Actor getSource() {
        return actor;
    }

    @Override
    public RESTEndpoint getDestination(DomainStory story, SoftwareSystem system) {
        return endpoint;
    }
}
