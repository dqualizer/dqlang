package io.github.dqualizer.dqlang.types.rqa.definition.monitoring

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Builder


@Builder
data class MonitoringDefinition @JsonCreator constructor(

    @JsonProperty("id")
    val id: String,

    /**
     * dq_id of the target work_object
     */
    @JsonProperty("target")
    var target: String,

    @JsonProperty("measurement_name")
    var measurementName: String,

    @JsonProperty("measurement_type")
    val measurementType: MeasurementType,

    @JsonProperty("measurement_unit")
    val measurementUnit: String
)

