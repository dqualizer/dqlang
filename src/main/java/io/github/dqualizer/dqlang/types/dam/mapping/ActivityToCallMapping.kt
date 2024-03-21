package io.github.dqualizer.dqlang.types.dam.mapping

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.dqualizer.dqlang.types.dam.architecture.CodeComponent
import io.github.dqualizer.dqlang.types.dam.domainstory.Activity
import lombok.Getter
import org.springframework.data.annotation.PersistenceCreator

class ActivityToCallMapping : DAMapping {
    @JsonProperty("end_correlation_id")
    @Getter
    var endCorrelationId: String? = null

    @JsonProperty("start_correlation_id")
    @Getter
    var startCorrelationId: String? = null

    @JsonProperty("end")
    @Getter
    var end: String? = null

    /**Constructor for sync calls*/
    constructor(dstElement: Activity, architectureEntity: CodeComponent) :
            super(dstElement.id, architectureEntity.id)

    /**Constructor for async calls*/
    constructor(
        dstElement: Activity,
        start: CodeComponent,
        end: CodeComponent,
        startCorrelationId: String,
        endCorrelationId: String
    ) : super(
        dstElement.id,
        start.id
    ) {
        this.end = end.id
        this.startCorrelationId = startCorrelationId
        this.endCorrelationId = endCorrelationId
    }


    /** Constructor for deserialization */
    @PersistenceCreator
    @JsonCreator
    constructor(
        @JsonProperty("dst_element_id")
        dstElementId: String,
        @JsonProperty("architecture_element_id")
        architectureElementId: String,
        @JsonProperty("end_correlation_id")
        endCorrelationId: String?,
        @JsonProperty("start_correlation_id")
        startCorrelationId: String?,
        @JsonProperty("end")
        end: String?
    ) : super(dstElementId, architectureElementId) {
        this.endCorrelationId = endCorrelationId
        this.startCorrelationId = startCorrelationId
        this.end = end
    }


    fun isAsync(): Boolean {
        return end != null
    }
}
