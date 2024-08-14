package io.github.dqualizer.dqlang.types.rqa.definition.resilience.stimulus

data class LateResponsesStimulus(
  override val pauseBeforeTriggeringSeconds: Int,
  override val experimentDurationSeconds: Int,
  val injectionFrequency: Int,
  val minDelayMilliseconds: Int,
  val maxDelayMilliseconds: Int
) : ResilienceStimulus()
