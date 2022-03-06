package com.example.demo.models.repository

import android.util.Log
import com.example.demo.models.network.entity.PersonResponse
import com.example.demo.models.network.service.PersonService
import com.example.demo.models.entity.Person
import io.ktor.utils.io.errors.*

object PersonRepository {
    suspend fun search(): Person {
        val person = Person("")

        try {
            val personResponse: PersonResponse = PersonService.search()
            person.name = personResponse.name
        } catch (e: IOException) {
            Log.d("Network", "no internet")
        }

        return person
    }
}