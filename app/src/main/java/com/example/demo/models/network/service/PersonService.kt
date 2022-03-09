package com.example.demo.models.network.service

import io.ktor.client.HttpClient
import io.ktor.client.request.*

import com.example.demo.models.network.entity.PersonResponse

class PersonService(private val client: HttpClient) {
    suspend fun search(): PersonResponse {
        return client.get {
            url("https://nippon.free.beeceptor.com/Person")
        }
    }
}