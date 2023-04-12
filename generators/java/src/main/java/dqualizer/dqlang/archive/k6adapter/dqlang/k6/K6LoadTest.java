package dqualizer.dqlang.archive.k6adapter.dqlang.k6;

import dqualizer.dqlang.archive.k6adapter.dqlang.k6.options.Options;
import dqualizer.dqlang.archive.k6adapter.dqlang.k6.request.Request;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class K6LoadTest {

    private int repetition;
    private Options options;
    private Request request;
}