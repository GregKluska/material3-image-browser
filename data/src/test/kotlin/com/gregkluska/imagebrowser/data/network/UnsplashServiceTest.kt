package com.gregkluska.imagebrowser.data.network

import com.gregkluska.imagebrowser.data.util.PHOTOS_TEST
import com.gregkluska.imagebrowser.data.util.PHOTO_ID_1_TEST
import com.gregkluska.imagebrowser.data.util.PHOTO_ID_2_TEST
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class UnsplashServiceTest {

    private lateinit var sut: UnsplashService

    private val mockEngine = MockEngine { request ->

        val resourceFileName = when (request.url.toString()) {
            "${UnsplashService.BASE_URL}/photos/testId1" -> "unsplash-get-photo-testid1-success.txt"
            "${UnsplashService.BASE_URL}/photos/testId2" -> "unsplash-get-photo-testid2-success.txt"
            "${UnsplashService.BASE_URL}/photos" -> "unsplash-get-photos-success.txt"
            "${UnsplashService.BASE_URL}/users/username1/photos" -> "unsplash-get-user1-photos-success.txt"
            "${UnsplashService.BASE_URL}/users/username2/photos" -> "unsplash-get-user2-photos-success.txt"
            else -> ""
        }

        respond(
            content = this::class.java.classLoader
                .getResourceAsStream(resourceFileName)!!.readAllBytes(),
            status = HttpStatusCode.OK,
            headers = headersOf(HttpHeaders.ContentType, "application/json")
        )
    }

    @Before
    fun setup() {
        sut = UnsplashServiceImpl(HttpClient(mockEngine) {
            install(ContentNegotiation) {
                json(
                    Json {
                        ignoreUnknownKeys = true
                    }
                )
            }
        })
    }

    @Test
    fun `test getPhoto when testId1 then should call the service with given url`() =
        runTest {
            assertEquals(PHOTO_ID_1_TEST, sut.getPhoto("testId1"))
        }

    @Test
    fun `test getPhoto when testId2 then should call the service with given url`() =
        runTest {
            assertEquals(PHOTO_ID_2_TEST, sut.getPhoto("testId2"))
        }


    @Test
    fun testGetPhotos() = runTest {
        assertEquals(PHOTOS_TEST, sut.getPhotos())
    }

    @Test
    fun `test getUsersPhoto when user1 then should call the service with given url`() = runTest {
        val response = sut.getUsersPhoto("username1")
        assert(response.size == 10)
        response.forEach {
            assertEquals("neom", it.user.username)
        }
    }

    @Test
    fun `test getUsersPhoto when user2 then should call the service with given url`() = runTest {
        val response = sut.getUsersPhoto("username2")
        assert(response.size == 10)
        response.forEach {
            assertEquals("masamasa3", it.user.username)
        }
    }

}