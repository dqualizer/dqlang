package io.github.dqualizer.dqlang.types.adapter.gatling.stimulus

data class GatlingInjectionIncreaseProfile(

  override val baseLoad: Double,

  val highestLoad: Int,

  val constantDuration: Int

) : GatlingInjectionProfile(baseLoad)
