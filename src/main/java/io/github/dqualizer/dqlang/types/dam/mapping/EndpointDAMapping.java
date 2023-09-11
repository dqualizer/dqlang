package io.github.dqualizer.dqlang.types.dam.mapping;

import io.github.dqualizer.dqlang.types.dam.architecture.RESTEndpoint;
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem;
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor;
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

/**
 * @author Lion Wagner
 */
public class EndpointDAMapping extends DAMapping<Actor, RESTEndpoint> {

    @DocumentReference
    private final Actor actor;

    @DocumentReference
    private final RESTEndpoint endpoint;

    public EndpointDAMapping(Actor actor, RESTEndpoint endpoint) {
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
