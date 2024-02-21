package io.github.dqualizer.dqlang.types.adapter.ctk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ResponseMeasuresExtension {

    @JsonProperty(value = "name", required = true)
    private String name;
    @JsonProperty(value = "expected_recovery_time_ms", required = false)
    private int expectedRecoveryTimeInMilliseconds;
    @JsonProperty(value = "expected_error_rate_percent", required = false)
    private int expectedErrorRateInPercent;
    @JsonProperty(value = "expected_response_time_ms", required = false)
    private int expectedResponseTimeInMilliseconds;

    public void setName(String name) {
        this.name = name;
    }

    public void setExpectedRecoveryTimeInMilliseconds(int recoveryTimeInMilliseconds) {
        this.expectedRecoveryTimeInMilliseconds = recoveryTimeInMilliseconds;
    }

    public void setExpectedErrorRateInPercent(int errorRateInPercent) {
        this.expectedErrorRateInPercent = errorRateInPercent;
    }

    public void setExpectedResponseTimeInMilliseconds(int responseTimeInMilliseconds) {
        this.expectedResponseTimeInMilliseconds = responseTimeInMilliseconds;
    }


}


