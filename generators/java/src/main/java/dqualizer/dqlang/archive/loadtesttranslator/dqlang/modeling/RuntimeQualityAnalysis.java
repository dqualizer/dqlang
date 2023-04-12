package dqualizer.dqlang.archive.loadtesttranslator.dqlang.modeling;

import lombok.Getter;
import lombok.ToString;

import java.util.LinkedHashSet;

@Getter
@ToString
public class RuntimeQualityAnalysis {

    private LinkedHashSet<Object> monitoring;
    private LinkedHashSet<Object> resilience;
    private LinkedHashSet<ModeledLoadTest> loadtests;
}