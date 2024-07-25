package io.github.dqualizer.dqlang.types.rqa.definition.resilience.stimulus

data class FailedRequestsStimulus(
  override val pauseBeforeTriggeringSeconds: Int,
  override val experimentDurationSeconds: Int,
  val injectionFrequency: Int
) : ResilienceStimulus()
