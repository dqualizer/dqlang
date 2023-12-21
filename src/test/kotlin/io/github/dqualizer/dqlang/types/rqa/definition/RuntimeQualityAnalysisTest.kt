package io.github.dqualizer.dqlang.types.rqa.definition

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.dqualizer.dqlang.messaging.AMQPAutoConfiguration
import io.github.dqualizer.dqlang.test.MessagingTestConfiguration
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.ConstantLoadStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.LoadIncreaseStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.LoadPeakStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus
import org.jeasy.random.EasyRandom
import org.jeasy.random.EasyRandomParameters
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.amqp.core.MessageProperties
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest(classes = [AMQPAutoConfiguration::class, RabbitAutoConfiguration::class])
@Import(MessagingTestConfiguration::class)
internal class RuntimeQualityAnalysisTest {

    @Autowired
    lateinit var messageConverter: MessageConverter

    @Autowired
    lateinit var objectMapper: ObjectMapper


    var generator = EasyRandom(
        EasyRandomParameters().randomize(
            Stimulus::class.java
        ) {
            return@randomize EasyRandom().nextObject(
                listOf(
                    LoadPeakStimulus::class.java,
                    LoadIncreaseStimulus::class.java,
                    ConstantLoadStimulus::class.java
                ).random()
            )
        }
    )

    @Test
    fun canSerializeToJson() {
        val rqa = generateRandomRQA()

        val msg = messageConverter.toMessage(rqa, MessageProperties())

        assertNotNull(msg.body)
        assertDoesNotThrow { objectMapper.readTree(msg.body) }
    }

    @Test
    fun canDeserializeFromJson() {
        val rqa = generateRandomRQA()

        val msg = messageConverter.toMessage(rqa, MessageProperties())

        val deserialized = messageConverter.fromMessage(msg) as RuntimeQualityAnalysis

        assertNotNull(msg.body)
        assertNotNull(deserialized)
        assertEquals(rqa.toString(), deserialized.toString())
    }

    private fun generateRandomRQA(): RuntimeQualityAnalysis {
        return generator.nextObject(RuntimeQualityAnalysis::class.java)
    }
}
