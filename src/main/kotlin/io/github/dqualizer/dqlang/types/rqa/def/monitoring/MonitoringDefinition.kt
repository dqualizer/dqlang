package io.github.dqualizer.dqlang.types.rqa.def.monitoring

import io.github.dqualizer.dqlang.types.rqa.def.MeasurementType


data class MonitoringDefinition(
    /**
     * dq_id of the target work_object
     */
    val target: String,

    val measurementName: String,

    val measurementType: MeasurementType,

    val measurementUnit: String
)

