package io.github.dqualizer.dqlang.types.adapter.ctk;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Rollbacks {

    List<Action> actions;

}
