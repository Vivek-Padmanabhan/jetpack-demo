package com.example.demo.models.network.service

import javax.inject.Inject

import io.ktor.client.*
import io.ktor.client.request.*

import com.example.demo.models.network.entity.AccountResponse

class AccountService @Inject constructor(private val client: HttpClient) {
    suspend fun getAccount(user_id: String): AccountResponse {
        return client.get {
            url("https://nippon.free.beeceptor.com/Person")
        }
    }
}