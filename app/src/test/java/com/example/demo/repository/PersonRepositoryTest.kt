package com.example.demo.repository

import org.junit.Test
import org.junit.Assert.*

import kotlinx.coroutines.runBlocking
import org.mockito.kotlin.mock

import com.example.demo.models.data.entity.Person
import com.example.demo.models.network.entity.PersonResponse
import com.example.demo.models.network.service.PersonService
import com.example.demo.models.data.repository.PersonRepository
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.stub

class PersonRepositoryTest {
    @Test
    fun checkRepository() = runBlocking {

    }
}