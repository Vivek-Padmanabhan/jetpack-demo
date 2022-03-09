package com.example.demo.controllers.koin

import android.util.Log
import com.example.demo.controllers.navigation.ButtonNavigation

import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.client.HttpClient
import io.ktor.client.request.header
import io.ktor.client.features.HttpTimeout
import io.ktor.client.features.DefaultRequest
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.Logging
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.observer.ResponseObserver
import io.ktor.client.engine.android.Android

import org.koin.dsl.module

import com.example.demo.models.data.repository.PersonRepository
import com.example.demo.models.network.service.PersonService

@JvmField
val appModule = module {
    single {
        HttpClient(Android) {
            // JSON
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                    encodeDefaults = false
                })

                engine {
                    connectTimeout = 60_000
                    socketTimeout = 60_000
                }
            }
            // Logging
            install(Logging) {
                logger = object : Logger {
                    override fun log(message: String) {
                        Log.v("Logger Ktor =>", message)
                    }
                }
                level = LogLevel.ALL
            }
            // Timeout
            install(HttpTimeout) {
                requestTimeoutMillis = 15000L
                connectTimeoutMillis = 15000L
                socketTimeoutMillis = 15000L
            }
            // Response Status
            install(ResponseObserver) {
                onResponse { response ->
                    Log.d("HTTP status:", "${response.status.value}")
                }
            }
            // Apply to all requests
            install(DefaultRequest) {
                header(HttpHeaders.ContentType, ContentType.Application.Json)
            }
        }
    }
    single { PersonService(get()) }
    single { PersonRepository(get()) }
    single { ButtonNavigation(get()) }
}
