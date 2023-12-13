import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.dqualizer.dqlang.types.adapter.ctk.Action;
import io.github.dqualizer.dqlang.types.adapter.ctk.CtkChaosExperiment;
import io.github.dqualizer.dqlang.types.adapter.ctk.Probe;
import io.github.dqualizer.dqlang.types.adapter.ctk.Provider;
import io.github.dqualizer.dqlang.types.adapter.ctk.SteadyStateHypothesis;
import io.github.dqualizer.dqlang.types.adapter.ctk.SteadyStateProbe;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CtkChaosExperimentTest {


    @Test
    void testSerialization() throws JsonProcessingException {

        // arrange
        ObjectMapper objectMapper = new ObjectMapper();
        String title = "CinemaBookingUnaivalabilty";
        String description = "This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown.";

        Provider provider = new Provider("python", "processMonitoring", "check_process_exists", Map.of("process_name", "cinema-booking-Service.exe"));
        Probe probe = new Probe("the-cinema-booking-service-must-be-running", provider);
        SteadyStateProbe steadyStateProbe = new SteadyStateProbe("the-cinema-booking-service-must-be-running", provider, objectMapper.convertValue(true, JsonNode.class));
        SteadyStateHypothesis steadyStateHypothesis = new SteadyStateHypothesis("Application responds", List.of(steadyStateProbe));

        Action action = new Action("kill-cinema-booking-Service", provider);
        List<Probe> method = List.of(action, probe) ;
        List<Action> rollbacks = List.of(action);

        CtkChaosExperiment ctkChaosExperiment = new CtkChaosExperiment(title, description, steadyStateHypothesis, method, rollbacks);


        // act
        String result = objectMapper.writeValueAsString(ctkChaosExperiment);

        // assert
        String expectedJson = "{\"title\":\"CinemaBookingUnaivalabilty\",\"description\":\"This is a resilience RQA, testing how long it takes until the cinema booking service is reachable again, after it was shutdown.\",\"steady-state-hypothesis\":{\"title\":\"Application responds\",\"probes\":[{\"type\":\"probe\",\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}},\"tolerance\":true}]},\"method\":[{\"type\":\"action\",\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}},{\"type\":\"probe\",\"name\":\"the-cinema-booking-service-must-be-running\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}],\"rollbacks\":[{\"type\":\"action\",\"name\":\"kill-cinema-booking-Service\",\"provider\":{\"type\":\"python\",\"module\":\"processMonitoring\",\"func\":\"check_process_exists\",\"arguments\":{\"process_name\":\"cinema-booking-Service.exe\"}}}]}";
        System.out.println(result);
        assertEquals(expectedJson, result);

    }
}
