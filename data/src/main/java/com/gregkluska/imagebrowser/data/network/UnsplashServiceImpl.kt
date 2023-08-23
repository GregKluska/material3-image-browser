package com.gregkluska.imagebrowser.data.network

import com.gregkluska.imagebrowser.data.model.ImageDto
import com.gregkluska.imagebrowser.data.network.UnsplashService.Factory.BASE_URL
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.client.statement.request
import java.awt.SystemColor.text

class UnsplashServiceImpl(
    private val httpClient: HttpClient,
) : UnsplashService {

    override suspend fun getPhoto(): List<ImageDto> {
        return httpClient.get("$BASE_URL/photos").body()
    }

    override suspend fun getPhoto(id: String): ImageDto {
        return httpClient.get("$BASE_URL/photos/$id").body()
    }

    override suspend fun getUsersPhoto(username: String): List<ImageDto> {
        return httpClient.get("$BASE_URL/users/$username/photos").body()
    }
}