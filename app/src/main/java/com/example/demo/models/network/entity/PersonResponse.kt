package com.example.demo.models.network.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PersonResponse (
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String
)