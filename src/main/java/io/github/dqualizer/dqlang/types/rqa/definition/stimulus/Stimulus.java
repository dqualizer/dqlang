package io.github.dqualizer.dqlang.types.rqa.definition.stimulus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.LoadProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = LoadPeakStimulus.class, name = "LOAD_PEAK"),
        @JsonSubTypes.Type(value = LoadIncreaseStimulus.class, name = "LOAD_INCREASE"),
        @JsonSubTypes.Type(value = ConstantLoadStimulus.class, name = "CONSTANT_LOAD")
})    
public abstract class Stimulus {

    private String type;
    @JsonProperty("load_profile")
    private LoadProfile loadProfile;

    private int accuracy;

    public void setLoadProfile(LoadProfile loadProfile) {
        this.loadProfile = loadProfile;
        this.type = loadProfile.name();
    }

}
