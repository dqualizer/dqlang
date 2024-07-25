package io.github.dqualizer.dqlang.types.rqa.definition.resilience.stimulus

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(
  JsonSubTypes.Type(value = UnavailabilityStimulus::class, name = "UNAVAILABILITY"),
  JsonSubTypes.Type(value = LateResponsesStimulus::class, name = "LATE_RESPONSES"),
  JsonSubTypes.Type(value = FailedRequestsStimulus::class, name = "FAILED_REQUESTS")
)
sealed class ResilienceStimulus {
  abstract val pauseBeforeTriggeringSeconds: Int
  abstract val experimentDurationSeconds: Int

  // Do not declare constructor for usage by subtypes,
  // as constructor chaining does not seem to work with jackson object mapper (building objects from json)
}
