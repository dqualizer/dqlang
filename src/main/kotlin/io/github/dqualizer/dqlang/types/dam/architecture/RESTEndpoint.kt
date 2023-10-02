package io.github.dqualizer.dqlang.types.dam.architecture

import lombok.Data
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.http.HttpMethod
import java.util.*

@Data
@Document
class RESTEndpoint(
    val name: String,
    val route: String,
    val components: Map<EndpointComponentType, Set<EndpointComponent>> = EnumMap(EndpointComponentType::class.java),
    val methods: Set<HttpMethod> = HashSet(),
    val responseDescription: ResponseDescription? = null
) : ArchitectureEntity() {
    enum class EndpointComponentType {
        PathVariable,
        QueryParameter,
        RequestBody,
        Header
    }

    @Data
    class EndpointComponent {
        private val type: EndpointComponentType? = null
        private val format: String? = null
        fun checkFormat(input: String?): Boolean {
            val regex = Regex(format!!)
            return regex.matches(input!!)
        }
    }


    fun getComponentsOfType(type: EndpointComponentType?): Set<EndpointComponent> {
        return components.getOrDefault(type, emptySet())
    }
}
