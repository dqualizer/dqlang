package io.github.dqualizer.dqlang.types.dam.mapping

import io.github.dqualizer.dqlang.types.dam.architecture.RESTEndpoint
import io.github.dqualizer.dqlang.types.dam.architecture.SoftwareSystem
import io.github.dqualizer.dqlang.types.dam.domainstory.DomainStory
import io.github.dqualizer.dqlang.types.dam.domainstory.Person
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class DAMapperTest {

    @Test
    fun mapsWhenKnown() {
        val person = Person("foo")
        val restEndpoint = RESTEndpoint("bar", "baz")
        val endpointMapping =
            EndpointDAMapping(person, restEndpoint)
        val mapper = DAMapper(
            setOf(endpointMapping),
            Mockito.mock(DomainStory::class.java),
            Mockito.mock(SoftwareSystem::class.java)
        )

        val mappedEndpoint = mapper.map<RESTEndpoint>(person)

        assertEquals(restEndpoint, mappedEndpoint);
    }


    @Test
    fun mapsUnknownToNull() {
        val mapper = DAMapper(setOf(), Mockito.mock(DomainStory::class.java), Mockito.mock(SoftwareSystem::class.java))
        val result = mapper.map(Person("foo"))
        assertNull(result)
    }

    @Test
    fun mapsUnknownTypedToNull() {
        val mapper = DAMapper(setOf(), Mockito.mock(DomainStory::class.java), Mockito.mock(SoftwareSystem::class.java))
        val result = mapper.map<SoftwareSystem>(Person("foo"))
        assertNull(result)
    }

    @Test
    fun usesCacheWhenRemapping() {
        val person = Person("foo")
        val restEndpoint = RESTEndpoint("bar", "baz")
        val endpointMapping =
            EndpointDAMapping(person, restEndpoint)
        val mapper = DAMapper(
            setOf(endpointMapping),
            Mockito.mock(DomainStory::class.java),
            Mockito.mock(SoftwareSystem::class.java)
        )

        val mapped1 = mapper.map(person)
        val mapped2 = mapper.map(person)

        assertEquals(restEndpoint, mapped1)
        assertEquals(mapped1, mapped2)
    }
}
