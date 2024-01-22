package io.github.dqualizer.dqlang.types.dam.architecture.apischema.field;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Input {

    private String name;
    private String in;
    private boolean required;
    private String type;
}
