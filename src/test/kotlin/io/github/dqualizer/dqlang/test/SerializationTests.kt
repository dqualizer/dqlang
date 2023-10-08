package io.github.dqualizer.dqlang.test

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.amqp.core.MessageProperties
import org.springframework.context.annotation.Import

@Import(MessagingTestConfiguration::class)
internal class SerializationTests : SerializationTestsBase() {

    @ParameterizedTest(name = "Can serialize {0} to json")
    @MethodSource("getSerializableClasses")
    fun canSerializeToJson(clazz: Class<*>) {
        val rqa = generator.nextObject(clazz)

        val msg = messageConverter.toMessage(rqa, MessageProperties())

        assertNotNull(msg.body)
        assertDoesNotThrow { objectMapper.readTree(msg.body) }
    }
}
