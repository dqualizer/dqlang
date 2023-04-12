package dqualizer.dqlang.archive.loadtesttranslator.dqlang.loadtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.domainarchitecturemapping.Endpoint;
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Artifact;
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.ResponseMeasure;
import dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling.Stimulus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoadTest {

    private Artifact artifact;
    private String description;
    private Stimulus stimulus;
    @JsonProperty("response_measure")
    private ResponseMeasure responseMeasure;
    private Endpoint endpoint;
}