package io.github.dqualizer.dqlang.test

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.springframework.amqp.core.MessageProperties
import org.springframework.context.annotation.Import
import java.nio.file.Files

@Import(MessagingTestConfiguration::class)
internal class SerializationTests : SerializationTestsBase() {

    @ParameterizedTest(name = "Can serialize {0} to json")
    @MethodSource("getSerializableClasses")
    fun canSerializeToJson(clazz: Class<*>) {
        val rqa = generateObjectWithCorrectSerializationClass(clazz)

        val msg = messageConverter.toMessage(rqa, MessageProperties())

        assertNotNull(msg.body)
        assertDoesNotThrow { objectMapper.readTree(msg.body) }


        if (clazz != Any::class.java) { //use this to generate new template test data, by replacing "Any" with the class you want to generate
            val prettyBody = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(objectMapper.readValue(msg.body, Any::class.java))

            val file = Files.createTempFile("dqlang", "${clazz.simpleName}.json").toFile()
            try {
                file.parentFile.mkdirs()
                file.writeText(prettyBody)
            } finally {
                file.delete()
            }
        }
    }
}
