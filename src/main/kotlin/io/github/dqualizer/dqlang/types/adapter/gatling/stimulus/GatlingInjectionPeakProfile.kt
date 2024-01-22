package io.github.dqualizer.dqlang.types.adapter.gatling.stimulus

data class GatlingInjectionPeakProfile (

    override val baseLoad: Double,

    val peakLoad: Int,

    val duration: Int

): GatlingInjectionProfile(baseLoad)
