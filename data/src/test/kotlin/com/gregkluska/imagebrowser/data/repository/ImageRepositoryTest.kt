package com.gregkluska.imagebrowser.data.repository

import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.core.model.User
import com.gregkluska.imagebrowser.data.model.ImageDto
import com.gregkluska.imagebrowser.data.model.TagDto
import com.gregkluska.imagebrowser.data.model.UrlsDto
import com.gregkluska.imagebrowser.data.model.UserDto
import com.gregkluska.imagebrowser.data.network.UnsplashService
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

class ImageRepositoryTest {

    private lateinit var sut: ImageRepository

    // variables
    private var getPhotosResponse: List<ImageDto> = listOf()
    private var getPhotoResponse: ImageDto = EmptyImage

    // mocks
    private val mockUnsplashService = mock<UnsplashService> {
        onBlocking { getPhotos() } doAnswer {
            getPhotosResponse
        }

        onBlocking { getPhoto(any()) } doAnswer {
            getPhotoResponse
        }

        onBlocking { getUsersPhoto(any()) } doAnswer {
            getPhotosResponse
        }
    }

    @Before
    fun setup() {
        getPhotosResponse = listOf()
        getPhotoResponse = EmptyImage
        sut = ImageRepository(
            unsplashService = mockUnsplashService
        )
    }

    @Test
    fun `getImages should call the service and map dto to domain models`() = runTest {
        getPhotosResponse = listOf(
            ImageDto(
                id = "abc",
                description = "Lorem Ipsum",
                tags = listOf(TagDto("Test")),
                urls = UrlsDto(
                    raw = "1",
                    full = "2",
                    regular = "3",
                    small = "4",
                    thumb = "5"
                ),
                user = UserDto(id = "TestId", username = "testusername", name = "name")
            )
        )

        val expected = listOf(
            Image(
                id = "abc",
                url = "2",
                tags = listOf("Test"),
                author = User(id = "TestId", username = "testusername", name = "name"),
                description = "Lorem Ipsum"
            )
        )

        val images = sut.getImages()
        assertEquals(expected, images)
        verify(mockUnsplashService, times(1)).getPhotos()
    }

    @Test
    fun `getImages should call the service and return empty list`() = runTest {
        getPhotosResponse = listOf()

        val expected: List<Image> = listOf()

        val images = sut.getImages()
        assertEquals(expected, images)
        verify(mockUnsplashService, times(1)).getPhotos()
    }

    @Test
    fun `getImage should call the service and map dto to domain model`() =
        runTest {
            getPhotoResponse =
                ImageDto(
                    id = "abc",
                    description = "Lorem Ipsum",
                    tags = listOf(TagDto("Test")),
                    urls = UrlsDto(
                        raw = "1",
                        full = "2",
                        regular = "3",
                        small = "4",
                        thumb = "5"
                    ),
                    user = UserDto(id = "TestId", username = "testusername", name = "name")
                )

            val expected =
                Image(
                    id = "abc",
                    url = "2",
                    tags = listOf("Test"),
                    author = User(id = "TestId", username = "testusername", name = "name"),
                    description = "Lorem Ipsum"
                )


            val images = sut.getImage("abc")
            assertEquals(expected, images)
            verify(mockUnsplashService, times(1)).getPhoto("abc")
        }

    @Test
    fun `getImage should call the service and map dto to domain model and use different id`() =
        runTest {
            getPhotoResponse =
                ImageDto(
                    id = "abcd",
                    description = "Lorem Ipsum",
                    tags = listOf(TagDto("Test")),
                    urls = UrlsDto(
                        raw = "1",
                        full = "2",
                        regular = "3",
                        small = "4",
                        thumb = "5"
                    ),
                    user = UserDto(id = "TestId", username = "testusername", name = "name")
                )

            val expected =
                Image(
                    id = "abcd",
                    url = "2",
                    tags = listOf("Test"),
                    author = User(id = "TestId", username = "testusername", name = "name"),
                    description = "Lorem Ipsum"
                )


            val images = sut.getImage("abcd")
            assertEquals(expected, images)
            verify(mockUnsplashService, times(1)).getPhoto("abcd")
        }

    @Test
    fun `getUsersImages should call the service with user id and map dto to domain models`() =
        runTest {
            getPhotosResponse = listOf(
                ImageDto(
                    id = "abc",
                    description = "Lorem Ipsum",
                    tags = listOf(TagDto("Test")),
                    urls = UrlsDto(
                        raw = "1",
                        full = "2",
                        regular = "3",
                        small = "4",
                        thumb = "5"
                    ),
                    user = UserDto(id = "TestId", username = "testusername", name = "name")
                )
            )

            val expected = listOf(
                Image(
                    id = "abc",
                    url = "2",
                    tags = listOf("Test"),
                    author = User(id = "TestId", username = "testusername", name = "name"),
                    description = "Lorem Ipsum"
                )
            )

            val images = sut.getUsersImages("username1")
            assertEquals(expected, images)
            verify(mockUnsplashService, times(1)).getUsersPhoto("username1")
        }

    @Test
    fun `getUsersImages should call the service with another user id and map dto to domain models`() =
        runTest {
            getPhotosResponse = listOf(
                ImageDto(
                    id = "abc",
                    description = "Lorem Ipsum",
                    tags = listOf(TagDto("Test")),
                    urls = UrlsDto(
                        raw = "1",
                        full = "2",
                        regular = "3",
                        small = "4",
                        thumb = "5"
                    ),
                    user = UserDto(id = "TestId", username = "testusername", name = "name")
                )
            )

            val expected = listOf(
                Image(
                    id = "abc",
                    url = "2",
                    tags = listOf("Test"),
                    author = User(id = "TestId", username = "testusername", name = "name"),
                    description = "Lorem Ipsum"
                )
            )

            val images = sut.getUsersImages("username2")
            assertEquals(expected, images)
            verify(mockUnsplashService, times(1)).getUsersPhoto("username2")
        }

    companion object {

        private val EmptyImage = ImageDto(
            id = "",
            description = null,
            urls = UrlsDto("", "", "", "", ""),
            user = UserDto("", "", "")
        )

    }

}