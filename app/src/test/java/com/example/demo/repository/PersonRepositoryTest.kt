package com.example.demo.repository

import org.junit.Test
import org.junit.Assert.*
import org.mockito.kotlin.mock
import org.mockito.kotlin.doReturn
import kotlinx.coroutines.runBlocking

import com.example.demo.models.data.entity.Person
import com.example.demo.models.network.entity.PersonResponse
import com.example.demo.models.network.service.PersonService
import com.example.demo.models.data.repository.PersonRepository

class PersonRepositoryTest {
    @Test
    fun checkRepository() {
        val personResponse = PersonResponse("1", "Test")
        val personService = mock<PersonService> {
            onBlocking { search() } doReturn personResponse
        }

        val personRepository = PersonRepository(personService)
        val person: Person = runBlocking {
            personRepository.search()
        }

        assertEquals("Test", person.name)
    }
}