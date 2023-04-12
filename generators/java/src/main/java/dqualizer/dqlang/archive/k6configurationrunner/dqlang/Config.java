package dqualizer.dqlang.archive.k6configurationrunner.dqlang;

import dqualizer.dqlang.archive.k6adapter.dqlang.loadtest.LoadTest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedHashSet;

/**
 * Java class for inoffical k6 loadtest configurations
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Config {

    private String name;
    private String baseURL;
    private LinkedHashSet<LoadTest> loadTests;
}