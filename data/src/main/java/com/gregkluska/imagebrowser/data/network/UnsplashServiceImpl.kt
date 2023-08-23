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

    override suspend fun getPhoto(): List<ImageDto> {
        return httpClient.get(EndPoints.PHOTO_LIST).body()
    }

    override suspend fun getPhoto(id: String): ImageDto {
        val res = httpClient.get("${EndPoints.PHOTO}/$id")
        println(id)
        println(res.bodyAsText())
        return res.body()
    }

    override suspend fun getUsersPhoto(userId: String): List<ImageDto> {
        TODO("Not yet implemented")
    }
}