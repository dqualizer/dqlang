package io.github.dqualizer.dqlang.types.rqa.definition.resilience.stimulus

data class UnavailabilityStimulus(
  override val pauseBeforeTriggeringSeconds: Int,
  override val experimentDurationSeconds: Int
) : ResilienceStimulus()
