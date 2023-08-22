package io.github.dqualizer.dqlang.types.openapiadapter.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Property {

    private String name;
    private String type;
}
