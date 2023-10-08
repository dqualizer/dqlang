package io.github.dqualizer.dqlang.test

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.dqualizer.dqlang.messaging.AMQPAutoConfiguration
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.LoadTestDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.MonitoringDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.ResilienceDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.ConstantLoadStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.LoadIncreaseStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.LoadPeakStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus
import org.jeasy.random.EasyRandom
import org.jeasy.random.EasyRandomParameters
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [AMQPAutoConfiguration::class, RabbitAutoConfiguration::class])
open class SerializationTestsBase {
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

    companion object {
        @JvmStatic
        fun getSerializableClasses(): List<Class<*>> {
            return listOf(
                MonitoringDefinition::class.java,
//                LoadTestDefinition::class.java,
//                ResilienceDefinition::class.java
            )
        }
    }
}
