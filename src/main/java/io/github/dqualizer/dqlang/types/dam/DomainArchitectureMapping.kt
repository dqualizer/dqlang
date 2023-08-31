package io.github.dqualizer.dqlang.types.dam

import com.fasterxml.jackson.annotation.JsonIgnore
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import lombok.Data
import lombok.Getter
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class DomainArchitectureMapping(
    @Id
    val id: String? = null,

    @DBRef
    val softwareSystem: SoftwareSystem,

    @DBRef
    val domainStory: DomainStory,

    @DBRef
    val mappings: Set<Mapping> = Collections.emptySet()
) {
    @Transient
    @JsonIgnore
    private val mapper: DAMapper

    init {
        mapper = DAMapper(mappings)
    }
}
