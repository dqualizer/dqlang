package io.github.dqualizer.dqlang.types.dam.domainstory;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.PersistenceCreator;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


@Getter
public final class Activity extends DSTElement {

    /**
     * Name of the activity the actor applies to the work objects (e.g. sends).
     */
    private String action;

    private Integer number = null;

    private Set<String> initiators;

    private Set<String> targets;

    /**
     * Work objects that are used along the path.
     */
    private Set<String> workObjects;


    private Activity(String name) {
        super(name);
    }

    @JsonCreator
    @PersistenceCreator
    public Activity(@JsonProperty("name") String name,
                    @JsonProperty("action") String action,
                    @JsonProperty("number") Integer number,
                    @JsonProperty("initiators") Set<String> initiators,
                    @JsonProperty("targets") Set<String> targets,
                    @JsonProperty("work_objects") Set<String> workObjects) {
        super(name);

        if(number == null || number < 0) throw new IllegalArgumentException("Number of Activity must be positive");

        this.action = action;
        this.number = number;
        this.initiators = new HashSet<>(initiators);
        this.targets = new HashSet<>(targets);
        this.workObjects = new HashSet<>(workObjects);
    }

    @Override
    public String toString() {
        return "Activity %s: %s %s %s to/for %s"
                .formatted(getId(), initiators, action.isBlank() ? "?" : action, workObjects, targets);
    }

    public static class Builder {
        private final Activity activity;

        public Builder(String name) {
            activity = new Activity(name);
        }

        public Builder action(String action) {
            activity.action = action;
            return this;
        }

        public Builder number(Integer number) {
            activity.number = number;
            return this;
        }

        public Builder initiators(Set<String> initiators) {
            activity.initiators = initiators;
            return this;
        }

        public Builder targets(Set<String> targets) {
            activity.targets = targets;
            return this;
        }

        public Builder workObjects(Set<String> workObjects) {
            activity.workObjects = workObjects;
            return this;
        }

        public Activity build() {
            return activity;
        }
    }
}
