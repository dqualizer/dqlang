package io.github.dqualizer.dqlang.types.rqa.definition.resilience

import lombok.Data

@Data
class ResilienceDefinition{

    //Dummy equals for now
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResilienceDefinition) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}

