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
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.http.HttpMethod
import java.lang.module.ModuleDescriptor
import java.lang.reflect.InaccessibleObjectException
import java.lang.reflect.Modifier
import java.util.*


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

    fun <T : Any> generateObjectWithCorrectSerializationClass(clazz: Class<T>): T {
        val obj = generator.nextObject(clazz) as T

        val list = LinkedList<Any>()
        list.add(obj)

        while (list.isNotEmpty()) {
            val current = list.removeFirst()

            if (current is Identifiable) {
                _classField.set(current, current::class.java.name)
            }

            current.javaClass.declaredFields.forEach {
                if (!Modifier.isStatic(it.modifiers)) {
                    try {
                        it.isAccessible = true
                        val value = it.get(current)
                        if (value != null) {
                            if (it.type.isArray) {
                                list.addAll(value as Array<Any>)
                            } else if(value is Collection<*>){
                                list.addAll(value as Collection<Any>)
                            } else if(value is Map<*, *>){
                                list.addAll(value.values as Collection<Any>)
                            } else {
                                list.add(value)
                            }
                        }
                    } catch (_: InaccessibleObjectException) {
                    }
                }
            }
        }

        return obj
    }


    companion object {

        private val serializableClasses: Set<Class<*>>

        private val _classField = Identifiable::class.java.getDeclaredField("_class")

        init {
            _classField.isAccessible = true

            val reflection = Reflections("io.github.dqualizer.dqlang.types")
            val instantiatableIdentifiableTypes = reflection.getSubTypesOf(Identifiable::class.java)
                .filter { !Modifier.isInterface(it.modifiers) && !Modifier.isAbstract(it.modifiers) }
            val documentClasses = reflection.getTypesAnnotatedWith(Document::class.java)
                .filter { !Modifier.isInterface(it.modifiers) && !Modifier.isAbstract(it.modifiers) }


            serializableClasses = setOf(
                MonitoringDefinition::class.java,
                LoadTestDefinition::class.java,
                ResilienceDefinition::class.java,
                APISchema::class.java,
                *instantiatableIdentifiableTypes.toTypedArray(),
                *documentClasses.toTypedArray(),
            )
        }

        @JvmStatic
        fun getSerializableClasses(): Set<Class<*>> {
            return serializableClasses
        }
    }
}
