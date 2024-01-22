package io.github.dqualizer.dqlang.types.dam.mapping

import io.github.dqualizer.dqlang.types.dam.architecture.CodeComponent
import io.github.dqualizer.dqlang.types.dam.domainstory.Activity

class ActivityToCallMapping : DAMapping {
    private var endCorrelationId: String? = null
    private var startCorrelationId: String? = null
    private var end: String? = null

    /**Constructor for sync calls*/
    constructor(dstElement: Activity, architectureEntity: CodeComponent) :
            super(dstElement.id!!, architectureEntity.id!!)


    /**Constructor for async calls*/
    constructor(
        dstElement: Activity,
        start: CodeComponent,
        end: CodeComponent,
        startCorrelationId: String,
        endCorrelationId: String
    ) : super(
        dstElement.id!!,
        start.id!!
    ) {
        this.end = end.id
        this.startCorrelationId = startCorrelationId
        this.endCorrelationId = endCorrelationId
    }

    fun isAsync(): Boolean {
        return end != null
    }
}
