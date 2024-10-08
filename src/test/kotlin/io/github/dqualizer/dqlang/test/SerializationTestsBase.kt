package io.github.dqualizer.dqlang.test

import com.fasterxml.jackson.databind.ObjectMapper
import io.github.dqualizer.dqlang.messaging.AMQPAutoConfiguration
import io.github.dqualizer.dqlang.types.dam.Identifiable
import io.github.dqualizer.dqlang.types.dam.domainstory.Actor
import io.github.dqualizer.dqlang.types.dam.domainstory.Group
import io.github.dqualizer.dqlang.types.dam.domainstory.Person
import io.github.dqualizer.dqlang.types.dam.domainstory.System
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.loadprofile.ConstantLoad
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.loadprofile.LoadIncrease
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.loadprofile.LoadPeak
import io.github.dqualizer.dqlang.types.rqa.definition.loadtest.stimulus.loadprofile.LoadProfile
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
    EasyRandomParameters().randomize(LoadProfile::class.java) {
      return@randomize EasyRandom().nextObject(
        listOf(
          LoadIncrease::class.java,
          LoadPeak::class.java,
          ConstantLoad::class.java
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
      it.name == "number"
    }, {
      return@randomize Random().nextInt(100)
    })
  )

  fun <T : Any> generateObjectWithCorrectSerializationClass(clazz: Class<T>): T {
    val obj = generator.nextObject(clazz) as T

    val list = LinkedList<Any>()
    list.add(obj)

    while (list.isNotEmpty()) {
      val current = list.removeFirst()

      current.javaClass.declaredFields.forEach {
        if (!Modifier.isStatic(it.modifiers)) {
          try {
            it.isAccessible = true
            val value = it.get(current)
            if (value != null) {
              if (it.type.isArray) {
                list.addAll(value as Array<Any>)
              } else if (value is Collection<*>) {
                list.addAll(value as Collection<Any>)
              } else if (value is Map<*, *>) {
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

    init {

      val reflection = Reflections("io.github.dqualizer.dqlang.types")
      val instantiatableIdentifiableTypes = reflection.getSubTypesOf(Identifiable::class.java)
        .filter { !Modifier.isInterface(it.modifiers) && !Modifier.isAbstract(it.modifiers) }
      val documentClasses = reflection.getTypesAnnotatedWith(Document::class.java)
        .filter { !Modifier.isInterface(it.modifiers) && !Modifier.isAbstract(it.modifiers) }


      serializableClasses = setOf(
//                MonitoringDefinition::class.java,
//                LoadTestDefinition::class.java,
//                ResilienceDefinition::class.java,
//                APISchema::class.java,
//                *instantiatableIdentifiableTypes.toTypedArray(),
//                *documentClasses.toTypedArray(),
        Group::class.java,
        Person::class.java,
        System::class.java,
      )
    }

    @JvmStatic
    fun getSerializableClasses(): Set<Class<*>> {
      return serializableClasses
    }
  }
}
