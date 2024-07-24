package io.github.dqualizer.dqlang.types.adapter.ctk

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
data class ResponseMeasuresExtension(
  @JsonProperty(value = "name", required = true)
  var name: String? = null,

  @JsonProperty(value = "expected_recovery_time_ms", required = false)
  var expectedRecoveryTimeInMilliseconds: Int = 0,

  @JsonProperty(value = "expected_error_rate_percent", required = false)
  var expectedErrorRateInPercent: Int = 0,

  @JsonProperty(value = "expected_response_time_ms", required = false)
  var expectedResponseTimeInMilliseconds: Int = 0
)
