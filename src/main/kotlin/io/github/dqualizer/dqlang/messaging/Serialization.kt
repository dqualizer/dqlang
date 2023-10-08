package io.github.dqualizer.dqlang.messaging

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer
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
