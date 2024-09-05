package com.example.myteam1


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.launch



class PostsViewModel : ViewModel() {

    val client = Provider.client

    var postsList by mutableStateOf(emptyList<TestApi>())
        private set

    init {
        viewModelScope.launch {
            // TODO: Handle failure ex: no internet
            postsList = client.get("https://fake-json-api.mock.beeceptor.com/notifications").body<List<TestApi>>()
        }
    }

}
