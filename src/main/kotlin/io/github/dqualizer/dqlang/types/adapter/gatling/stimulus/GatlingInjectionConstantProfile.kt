package io.github.dqualizer.dqlang.types.adapter.gatling.stimulus

data class GatlingInjectionConstantProfile(

  override val baseLoad: Double,

  val targetLoad: Double,

  val duration: Int

) : GatlingInjectionProfile(baseLoad)
