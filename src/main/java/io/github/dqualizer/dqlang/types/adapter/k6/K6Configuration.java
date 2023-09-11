package io.github.dqualizer.dqlang.types.adapter.k6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

/**
 * Java class for k6 loadtest configurations
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class K6Configuration {

    private String name;
    private String baseURL;
    private Set<K6LoadTest> k6LoadTests;
}
