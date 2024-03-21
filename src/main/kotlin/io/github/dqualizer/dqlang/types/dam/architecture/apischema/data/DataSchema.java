package io.github.dqualizer.dqlang.types.dam.architecture.apischema.data;

import lombok.*;

import java.util.Set;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataSchema {

    private String type;
    private Set<Property> properties;
}
