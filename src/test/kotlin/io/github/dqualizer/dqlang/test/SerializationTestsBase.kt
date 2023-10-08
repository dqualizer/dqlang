package io.github.dqualizer.dqlang.test

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.dqualizer.dqlang.messaging.AMQPAutoConfiguration
import io.github.dqualizer.dqlang.types.dam.Identifiable
import io.github.dqualizer.dqlang.types.dam.architecture.apischema.APISchema
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor
import io.github.dqualizer.dqlang.types.dam.domainstory.Group
import io.github.dqualizer.dqlang.types.dam.domainstory.Person
import io.github.dqualizer.dqlang.types.dam.domainstory.System
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.LoadTestDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.monitoring.MonitoringDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.resilience.ResilienceDefinition
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.ConstantLoadStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.LoadIncreaseStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.LoadPeakStimulus
import io.github.dqualizer.dqlang.types.rqa.definition.stimulus.Stimulus
import org.jeasy.random.EasyRandom
import org.jeasy.random.EasyRandomParameters
import org.reflections.Reflections
import org.springframework.amqp.support.converter.MessageConverter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpMethod
import java.lang.module.ModuleDescriptor
import java.lang.reflect.Modifier


@SpringBootTest(classes = [AMQPAutoConfiguration::class, RabbitAutoConfiguration::class])
class SerializationTestsBase {
    @Autowired
    lateinit var messageConverter: MessageConverter

    @Autowired
    lateinit var objectMapper: ObjectMapper

    var generator = EasyRandom(
        EasyRandomParameters().randomize(Stimulus::class.java) {
            return@randomize EasyRandom().nextObject(
                listOf(
                    LoadPeakStimulus::class.java,
                    LoadIncreaseStimulus::class.java,
                    ConstantLoadStimulus::class.java
                ).random()
            )
        }.randomize(Actor::class.java) {
            return@randomize EasyRandom().nextObject(
                listOf(
                    Person::class.java,
                    Group::class.java,
                    System::class.java
                ).random()
            )
        }.randomize(ModuleDescriptor.Version::class.java) {
            val rng = EasyRandom()
            return@randomize ModuleDescriptor.Version.parse("${rng.nextInt(100)}.${rng.nextInt(100)}.${rng.nextInt(100)}")
        }.randomize(HttpMethod::class.java) {
            return@randomize HttpMethod.values().random()
        }.randomize({
            it.name == "_class"
        }, {
            return@randomize ""
        })
    )


    companion object {

        private val instantiatableIdentifiableTypes: List<Class<*>>

        private val serializableClasses: Set<Class<*>>

        init {
            val reflection = Reflections("io.github.dqualizer.dqlang.types")
            val identifiableTypes = reflection.getSubTypesOf(Identifiable::class.java)
            instantiatableIdentifiableTypes = identifiableTypes
                .filter { !Modifier.isInterface(it.modifiers) && !Modifier.isAbstract(it.modifiers) }

            serializableClasses = setOf(
                MonitoringDefinition::class.java,
                LoadTestDefinition::class.java,
                ResilienceDefinition::class.java,
                APISchema::class.java,
                *instantiatableIdentifiableTypes.toTypedArray()
            )
        }

        @JvmStatic
        fun getSerializableClasses(): Set<Class<*>> {
            return serializableClasses
        }
    }
}
