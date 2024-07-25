package io.github.dqualizer.dqlang

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.github.dqualizer.dqlang.messaging.HTTPMethodDeserializer
import io.github.dqualizer.dqlang.messaging.HTTPMethodSerializer
import io.github.dqualizer.dqlang.messaging.VersionDeserializer
import io.github.dqualizer.dqlang.messaging.VersionSerializer
import io.github.dqualizer.dqlang.types.adapter.ctk.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.http.HttpMethod
import java.lang.module.ModuleDescriptor

class CtkChaosExperimentTest {
  private val converterModule = SimpleModule("dqlang_converters")
    .addSerializer(ModuleDescriptor.Version::class.java, VersionSerializer())
    .addDeserializer(ModuleDescriptor.Version::class.java, VersionDeserializer())
    .addSerializer(HttpMethod::class.java, HTTPMethodSerializer())
    .addDeserializer(HttpMethod::class.java, HTTPMethodDeserializer())

  private val objectMapper = ObjectMapper()
    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    .configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false)
    .setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
    .registerModule(converterModule)
    .registerKotlinModule()

  private var title: String? = null
  private var description: String? = null
  private var method: List<Probe>? = null


  @BeforeEach
  fun setup() {
    // arrange

    title = "CinemaBookingUnaivalabilty"
    description =
      "This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown."

    val provider = Provider(
      "python",
      "processMonitoring",
      "check_process_exists",
      mapOf("process_name" to "cinema-booking-Service.exe")
    )
    val probe = Probe(name = "the-cinema-booking-service-must-be-running", provider = provider)

    val pauses = Pauses(0, 10)
    val action = Action(name = "kill-cinema-booking-Service", provider = provider, pauses = pauses)
    method = listOf(action, probe)
  }


  @Test
  @Throws(JsonProcessingException::class)
  fun testSerializationWithAllProperties() {
    //arrange
    val username = "oneUsername"
    val password = "onePasswort"
    val dbUsername = "oneDBUsername"
    val dbPassword = "oneDBPassword"

    val authenticationSecret = AuthenticationSecret(username, password, dbUsername, dbPassword)
    val secrets = Secrets(authenticationSecret)

    val provider = Provider(
      "python",
      "processMonitoring",
      "check_process_exists",
      mapOf("process_name" to "cinema-booking-Service.exe")
    )
    val steadyStateProbe = SteadyStateProbe(
      "the-cinema-booking-service-must-be-running", provider, objectMapper.convertValue(
        true,
        JsonNode::class.java
      )
    )
    val steadyStateHypothesis = SteadyStateHypothesis("Application responds", java.util.List.of(steadyStateProbe))

    val action = Action(name = "kill-cinema-booking-Service", provider = provider)
    val rollbacks = listOf(action)

    val responseMeasuresExtension = ResponseMeasuresExtension()
    responseMeasuresExtension.name = "expected response measures"
    responseMeasuresExtension.expectedRecoveryTimeInMilliseconds = 2000

    val rollbacksStrategy = Strategy("deviated")
    val runtime = Runtime()
    runtime.rollbacksStrategy = rollbacksStrategy

    val ctkChaosExperiment = CtkChaosExperiment(
      title!!,
      description,
      secrets,
      steadyStateHypothesis,
      method,
      rollbacks,
      listOf(responseMeasuresExtension),
      runtime
    )

    println(ctkChaosExperiment)

    // act
    val result = objectMapper.writeValueAsString(ctkChaosExperiment)

    // assert
    val expectedJson =
      "{\"title\":\"CinemaBookingUnaivalabilty\",\"description\":\"This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown.\",\"secrets\":{\"authentication\":{\"username\":\"oneUsername\",\"password\":\"onePasswort\",\"db_username\":\"oneDBUsername\",\"db_password\":\"oneDBPassword\"}},\"steady-state-hypothesis\":{\"title\":\"Application responds\",\"probes\":[{\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}},\"tolerance\":true,\"type\":\"probe\"}]},\"method\":[{\"type\":\"action\",\"pauses\":{\"before\":0,\"after\":10},\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}},{\"type\":\"probe\",\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}],\"rollbacks\":[{\"type\":\"action\",\"pauses\":null,\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}],\"extensions\":[{\"name\":\"expected response measures\",\"expected_recovery_time_ms\":2000}],\"runtime\":{\"rollbacks\":{\"strategy\":\"deviated\"}}}"
    //System.out.println(result);
    Assertions.assertEquals(expectedJson, result)
  }

  @Test
  @Throws(JsonProcessingException::class)
  fun testSerializationOnlyWithMandatoryProperties() {
    // arrange

    val ctkChaosExperiment = CtkChaosExperiment(title!!, description, method = method)

    // act
    val result = objectMapper.writeValueAsString(ctkChaosExperiment)

    // assert
    val expectedJson =
      "{\"title\":\"CinemaBookingUnaivalabilty\",\"description\":\"This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown.\",\"secrets\":null,\"steady-state-hypothesis\":null,\"method\":[{\"type\":\"action\",\"pauses\":{\"before\":0,\"after\":10},\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}},{\"type\":\"probe\",\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}],\"rollbacks\":null,\"extensions\":[],\"runtime\":null}"
    Assertions.assertEquals(expectedJson, result)
  }
}
