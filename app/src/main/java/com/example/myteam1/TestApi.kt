package com.example.myteam1


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TestApi(
    @SerialName("id")
    val id: Int,
    @SerialName("message")
    val message: String,
    @SerialName("read")
    val read: Boolean,
    @SerialName("timestamp")
    val timestamp: String,
    @SerialName("title")
    val title: String,
    @SerialName("type")
    val type: String
)