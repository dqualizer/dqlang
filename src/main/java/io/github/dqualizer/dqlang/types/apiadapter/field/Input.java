package io.github.dqualizer.dqlang.types.apiadapter.field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Input {

    private String name;
    private String in;
    private boolean required;
    private String type;
}
