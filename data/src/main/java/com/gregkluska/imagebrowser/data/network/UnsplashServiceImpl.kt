package com.gregkluska.imagebrowser.data.network

import com.gregkluska.imagebrowser.data.model.ImageDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.client.statement.request
import java.awt.SystemColor.text

class UnsplashServiceImpl(
    private val httpClient: HttpClient,
) : UnsplashService {

    override suspend fun getPhotos(): List<ImageDto> {
        val test = httpClient.get(EndPoints.PHOTO_LIST)
        println(test.request.headers)

        println("body:")
        println(test.bodyAsText())

        return test.body()
    }

    override suspend fun getPhotos(id: String): ImageDto {
        TODO("Not yet implemented")
    }

    override suspend fun getUsersPhoto(userId: String): List<ImageDto> {
        TODO("Not yet implemented")
    }
}