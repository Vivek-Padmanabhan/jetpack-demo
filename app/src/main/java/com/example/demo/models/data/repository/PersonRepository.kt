package com.example.demo.models.data.repository

import android.util.Log

import javax.inject.Inject

import io.ktor.utils.io.errors.*

import com.example.demo.models.network.entity.PersonResponse
import com.example.demo.models.network.service.PersonService
import com.example.demo.models.data.entity.Person

class PersonRepository @Inject constructor(private val personService: PersonService) {
    suspend fun search(): Person {
        val person = Person("")

        try {
            val personResponse: PersonResponse = personService.search()
            person.name = personResponse.name
        } catch (e: IOException) {
            Log.d("Network", "no internet")
        }

        return person
    }
}