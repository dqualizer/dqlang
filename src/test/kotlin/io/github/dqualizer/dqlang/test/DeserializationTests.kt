package io.github.dqualizer.dqlang.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.amqp.core.MessageProperties
import org.springframework.context.annotation.Import

@Import(MessagingTestConfiguration::class)
internal class DeserializationTests : SerializationTestsBase() {

    @ParameterizedTest(name = "Can deserialize {0} from json")
    @MethodSource("getSerializableClasses")
    fun canDeserializeToJson(clazz: Class<*>) {
        val rqa = generator.nextObject(clazz)

        val msg = messageConverter.toMessage(rqa, MessageProperties())

        try {
            val deserialized = clazz.cast(messageConverter.fromMessage(msg))
            assertEquals(rqa, deserialized)
        } catch (e: Exception) {
            val prettyBody = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(objectMapper.readValue(msg.body, Any::class.java))
            println("Failed to deserialize ${clazz.simpleName} from json string:\n${prettyBody}")
            throw e
        }
    }
}
