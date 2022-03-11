package com.example.demo.service

import org.junit.Test
import org.junit.After
import org.junit.Before
import org.junit.Assert.*
import org.koin.test.get
import org.koin.test.KoinTest
import org.koin.core.context.stopKoin
import org.koin.core.context.startKoin
import kotlinx.coroutines.runBlocking

import com.example.demo.controllers.dependency.appModule
import com.example.demo.models.network.entity.PersonResponse
import com.example.demo.models.network.service.PersonService

class PersonServiceTest: KoinTest {
    @Before
    fun create() {
        startKoin {
            modules(appModule)
        }
    }

    @Test
    fun checkService() {
        val personService = get<PersonService>()

        val personResponse: PersonResponse = runBlocking {
            personService.search()
        }

        assertTrue(personResponse.name is String)
    }

    @After
    fun destroy() {
        stopKoin()
    }
}