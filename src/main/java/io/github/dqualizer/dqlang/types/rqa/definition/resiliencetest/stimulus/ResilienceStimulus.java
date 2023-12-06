package io.github.dqualizer.dqlang.types.rqa.definition.resiliencetest.stimulus;

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
       // @JsonSubTypes.Type(value = LoadIncreaseStimulus.class, name = "LOAD_INCREASE"),
       // @JsonSubTypes.Type(value = ConstantLoadStimulus.class, name = "CONSTANT_LOAD")
})    
public abstract class ResilienceStimulus {

    private String type;

    // TODO adapt
/*    @JsonProperty("load_profile")
    private LoadProfile loadProfile;*/

    private int accuracy;

    /*public void setLoadProfile(LoadProfile loadProfile) {
        this.loadProfile = loadProfile;
        this.type = loadProfile.name();
    }*/



}
