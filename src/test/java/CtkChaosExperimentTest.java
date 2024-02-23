import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.dqualizer.dqlang.types.adapter.ctk.Action;
import io.github.dqualizer.dqlang.types.adapter.ctk.AuthenticationSecret;
import io.github.dqualizer.dqlang.types.adapter.ctk.CtkChaosExperiment;
import io.github.dqualizer.dqlang.types.adapter.ctk.Pauses;
import io.github.dqualizer.dqlang.types.adapter.ctk.Probe;
import io.github.dqualizer.dqlang.types.adapter.ctk.Provider;
import io.github.dqualizer.dqlang.types.adapter.ctk.ResponseMeasuresExtension;
import io.github.dqualizer.dqlang.types.adapter.ctk.Secrets;
import io.github.dqualizer.dqlang.types.adapter.ctk.SteadyStateHypothesis;
import io.github.dqualizer.dqlang.types.adapter.ctk.SteadyStateProbe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CtkChaosExperimentTest {
    CtkChaosExperiment ctkChaosExperiment;
    ObjectMapper objectMapper;
    @BeforeEach
    void setup(){

        // arrange

        String title = "CinemaBookingUnaivalabilty";
        String description = "This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown.";

        Provider provider = new Provider("python", "processMonitoring", "check_process_exists", Map.of("process_name", "cinema-booking-Service.exe"));
        Probe probe = new Probe("the-cinema-booking-service-must-be-running", provider);

        Pauses pauses = new Pauses(0,10);
        Action action = new Action("kill-cinema-booking-Service", provider, pauses);
        List<Probe> method = List.of(action, probe) ;

        ctkChaosExperiment = new CtkChaosExperiment(title, description, method, 1);
        objectMapper = new ObjectMapper();

    }


    @Test
    void testSerializationWithAllProperties() throws JsonProcessingException {
        //arrange
        String username = "oneUsername";
        String password = "onePasswort";
        String dbUsername = "oneDBUsername";
        String dbPassword = "oneDBPassword";

        AuthenticationSecret authenticationSecret = new AuthenticationSecret(username, password, dbUsername, dbPassword);
        Secrets secrets = new Secrets(authenticationSecret);

        Provider provider = new Provider("python", "processMonitoring", "check_process_exists", Map.of("process_name", "cinema-booking-Service.exe"));
        SteadyStateProbe steadyStateProbe = new SteadyStateProbe("the-cinema-booking-service-must-be-running", provider, objectMapper.convertValue(true, JsonNode.class));
        SteadyStateHypothesis steadyStateHypothesis = new SteadyStateHypothesis("Application responds", List.of(steadyStateProbe));

        Action action = new Action("kill-cinema-booking-Service", provider);
        List<Action> rollbacks = List.of(action);

        ResponseMeasuresExtension responseMeasuresExtension= new ResponseMeasuresExtension();
        responseMeasuresExtension.setName("expected response measures");
        responseMeasuresExtension.setExpectedRecoveryTimeInMilliseconds(2000);


        ctkChaosExperiment.setSecrets(secrets);
        ctkChaosExperiment.setSteadyStateHypothesis(steadyStateHypothesis);
        ctkChaosExperiment.setRollbacks(rollbacks);
        ctkChaosExperiment.setExtensions(List.of(responseMeasuresExtension));

        // act
        String result = objectMapper.writeValueAsString(ctkChaosExperiment);

        // assert
        String expectedJson = "{\"title\":\"CinemaBookingUnaivalabilty\",\"description\":\"This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown.\",\"secrets\":{\"authentication\":{\"username\":\"oneUsername\",\"password\":\"onePasswort\",\"db_username\":\"oneDBUsername\",\"db_password\":\"oneDBPassword\"}},\"steady-state-hypothesis\":{\"title\":\"Application responds\",\"probes\":[{\"type\":\"probe\",\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}},\"tolerance\":true}]},\"method\":[{\"type\":\"action\",\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}},\"pauses\":{\"before\":0,\"after\":10}},{\"type\":\"probe\",\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}],\"rollbacks\":[{\"type\":\"action\",\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}],\"extensions\":[{\"name\":\"expected response measures\",\"expected_recovery_time_ms\":2000}]}";
        //System.out.println(result);
        assertEquals(expectedJson, result);

    }

    @Test
    void testSerializationOnlyWithMandatoryProperties() throws JsonProcessingException {

        // act
        String result = objectMapper.writeValueAsString(ctkChaosExperiment);

        // assert
        String expectedJson = "{\"title\":\"CinemaBookingUnaivalabilty\",\"description\":\"This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown.\",\"method\":[{\"type\":\"action\",\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}},\"pauses\":{\"before\":0,\"after\":10}},{\"type\":\"probe\",\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}]}";
        System.out.println(result);
        assertEquals(expectedJson, result);

    }
}
