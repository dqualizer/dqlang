package io.github.dqualizer.dqlang.archive.k6configurationrunner.dqlang;

import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Options;
import io.github.dqualizer.dqlang.archive.k6adapter.dqlang.k6.request.Request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoadTest {

    private int repetition;
    private Options options;
    private Request request;
}