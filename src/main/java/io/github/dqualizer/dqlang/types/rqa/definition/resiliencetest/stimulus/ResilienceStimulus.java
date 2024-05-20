package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.LoadProfile;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.ConstantLoadStimulus;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.LoadIncreaseStimulus;
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.LoadPeakStimulus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = UnavailabilityStimulus.class, name = "UNAVAILABILITY"),
        @JsonSubTypes.Type(value = LateResponsesStimulus.class, name = "LATE_RESPONSES"),
        @JsonSubTypes.Type(value = FailedRequestsStimulus.class, name = "FAILED_REQUESTS")
})
public abstract class ResilienceStimulus {

    private int pauseBeforeTriggeringSeconds;
    private int experimentDurationSeconds;

    // Do not declare constructor for usage by subtypes,
    // as constructor chaining does not seem to work with jackson object mapper (building objects from json)

}
