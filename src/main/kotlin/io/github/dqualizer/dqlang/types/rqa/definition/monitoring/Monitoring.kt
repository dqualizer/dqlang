package io.github.dqualizer.dqlang.types.rqa.definition.monitoring

import io.github.dqualizer.dqlang.types.rqa.definition.MeasurementType


data class Monitoring(
    /**
     * dq_id of the target work_object
     */
    val target: String,

    val measurementName: String,

    val measurementType: MeasurementType,

    val measurementUnit: String
)

