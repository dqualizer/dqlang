package io.github.dqualizer.dqlang.types.dam.architecture;

import io.github.dqualizer.dqlang.types.dam.Identifiable;
import kotlin.text.Regex;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpMethod;

import java.util.*;

@Data
@Document
public class RESTEndpoint extends ArchitectureEntity {

    public enum EndpointComponentType {
        PathVariable,
        QueryParameter,
        RequestBody,
        Header
    }

    @Data
    public static class EndpointComponent {
        private EndpointComponentType type;
        private String format;

        public final boolean checkFormat(String input) {
            Regex regex = new Regex(format);
            return regex.matches(input);
        }

    }

    private String name;
    private String route;

    private Map<EndpointComponentType, Set<EndpointComponent>> components = new HashMap<>();

    private Set<HttpMethod> methods = new HashSet<>();

    private ResponseDescription responseDescription;

    public Set<EndpointComponent> getComponentsOfType(EndpointComponentType type) {
        return components.getOrDefault(type, Collections.emptySet());
    }

}
