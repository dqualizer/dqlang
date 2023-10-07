package io.github.dqualizer.dqlang.types.dam.architecture.apischema.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DataSchema {

    private String type;
    private Set<Property> properties;
}
