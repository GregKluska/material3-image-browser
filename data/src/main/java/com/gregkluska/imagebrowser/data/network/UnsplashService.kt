package com.gregkluska.imagebrowser.data.network

import com.gregkluska.imagebrowser.data.model.ImageDto
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.AuthProvider
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.http.HttpHeaders
import io.ktor.http.auth.HttpAuthHeader
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

interface UnsplashService {

    suspend fun getPhoto(): List<ImageDto>

    suspend fun getPhoto(id: String): ImageDto

    suspend fun getUsersPhoto(userId: String): List<ImageDto>

    companion object Factory {
        fun build(
            clientId: String
        ): UnsplashService {
            return UnsplashServiceImpl(
                httpClient = HttpClient(Android) {
                    install(ContentNegotiation) {
                        json(
                            Json {
                                ignoreUnknownKeys = true
                            }
                        )
                    }
                    install(Auth) {
                        this.providers.add(object : AuthProvider {

                            @Deprecated("Please use sendWithoutRequest function instead")
                            override val sendWithoutRequest: Boolean = true

                            override suspend fun addRequestHeaders(
                                request: HttpRequestBuilder,
                                authHeader: HttpAuthHeader?
                            ) {
                                request.headers[HttpHeaders.Authorization] =
                                    "Client-ID $clientId"
                            }

                            override fun isApplicable(auth: HttpAuthHeader): Boolean = true
                        })
                    }
                }
            )
        }
    }

}