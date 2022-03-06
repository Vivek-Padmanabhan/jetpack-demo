package com.example.demo.models.network.service

import io.ktor.client.request.*

import com.example.demo.models.network.config.ApiService
import com.example.demo.models.network.entity.PersonResponse

object PersonService {
    private val client by lazy { ApiService.getInstance }

    suspend fun search(): PersonResponse {
        return client.get {
            url("https://nippon.free.beeceptor.com/Person")
        }
    }
}