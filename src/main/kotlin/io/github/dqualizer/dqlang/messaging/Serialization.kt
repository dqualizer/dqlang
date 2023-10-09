package io.github.dqualizer.dqlang.messaging

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import io.github.dqualizer.dqlang.types.dam.Identifiable
import org.springframework.http.HttpMethod
import java.lang.module.ModuleDescriptor.Version

class VersionSerializer : StdSerializer<Version>(Version::class.java) {
    override fun serialize(value: Version?, gen: JsonGenerator?, provider: SerializerProvider?) {
        gen?.writeString(value.toString())
    }
}

class VersionDeserializer : StdDeserializer<Version>(Version::class.java) {
    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): Version {
        return Version.parse(p?.text)
    }
}

class HTTPMethodSerializer : StdSerializer<HttpMethod>(HttpMethod::class.java) {
    override fun serialize(value: HttpMethod?, gen: JsonGenerator?, provider: SerializerProvider?) {
        gen?.writeString(value.toString())
    }
}

class HTTPMethodDeserializer : StdDeserializer<HttpMethod>(HttpMethod::class.java) {
    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): HttpMethod {
        return HttpMethod.valueOf(p!!.text)
    }
}


class IdentifiableSerializer: StdSerializer<Identifiable>(Identifiable::class.java) {
    override fun serialize(value: Identifiable?, gen: JsonGenerator?, provider: SerializerProvider?) {
        gen?.writeString(value?.id)
    }
}

class JsonSubTypeDeserializer(private val mapper: ObjectMapper) {
    fun <T> createDeserializer(clazz: Class<T>): StdDeserializer<T> {
        return object : StdDeserializer<T>(clazz) {
            override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): T {
                val targetClassName = p!!.getValueAsString("@type")
                val targetType = ctxt!!.findClass(targetClassName)
                throw NotImplementedError()
//                return mapper.readValue(p.text, targetType) as T
            }
        }
    }
}
