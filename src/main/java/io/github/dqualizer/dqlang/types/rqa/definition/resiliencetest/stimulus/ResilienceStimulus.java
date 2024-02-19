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

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = UnavailabilityStimulus.class, name = "UNAVAILABILITY"),
        @JsonSubTypes.Type(value = LateResponsesStimulus.class, name = "LATE_RESPONSES")
})    
public abstract class ResilienceStimulus {

    private int accuracy;

    // TODO adapt
/*    @JsonProperty("load_profile")
    private LoadProfile loadProfile;*/



    /*public void setLoadProfile(LoadProfile loadProfile) {
        this.loadProfile = loadProfile;
        this.type = loadProfile.name();
    }*/



}