package definition

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.dqualizer.dqlang.messaging.AMQPAutoConfiguration
import io.github.dqualizer.dqlang.messaging.MessagingConfiguration
import io.github.dqualizer.dqlang.types.rqa.definition.RuntimeQualityAnalysis
import io.github.dqualizer.dqlang.types.rqa.definition.RuntimeQualityAnalysisDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.enums.Environment
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.amqp.core.MessageProperties
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import


@SpringBootTest(classes = [AMQPAutoConfiguration::class, RabbitAutoConfiguration::class])
@Import(MessagingConfiguration::class)
class RuntimeQualityAnalysisDefinitionTest {

    @Autowired
    lateinit var messageConverter: MessageConverter

    @Autowired
    lateinit var objectMapper: ObjectMapper

    @Test
    fun canBeSerializedToJson() {
        val rqaD = RuntimeQualityAnalysisDefinition(
            "testRQA",
            "1.0",
            Environment.TEST,
            "domain 5",
            "test_context",
            RuntimeQualityAnalysis()
        )
        val msg = messageConverter.toMessage(rqaD, MessageProperties())


        assertNotNull(msg.body)

        assertDoesNotThrow { objectMapper.readTree(msg.body) }
    }

    @Test
    fun canBeDeserializedFromJson() {
        val rawRQAD = RuntimeQualityAnalysisDefinition(
            "testRQA",
            "1.0",
            Environment.TEST,
            "domain 5",
            "test_context",
            RuntimeQualityAnalysis()
        )
        val msg = messageConverter.toMessage(rawRQAD, MessageProperties())

        val deserializedRQAD = messageConverter.fromMessage(msg) as RuntimeQualityAnalysisDefinition

        //Doing a string based comparison here, since the ID is not set
        assertEquals(rawRQAD.toString(), deserializedRQAD.toString())
    }

}
