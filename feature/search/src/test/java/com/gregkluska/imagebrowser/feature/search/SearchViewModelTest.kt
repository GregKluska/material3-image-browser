package com.gregkluska.imagebrowser.feature.search

import androidx.lifecycle.SavedStateHandle
import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.data.model.ImageDto
import com.gregkluska.imagebrowser.data.model.UrlsDto
import com.gregkluska.imagebrowser.data.model.UserDto
import com.gregkluska.imagebrowser.data.model.toImage
import com.gregkluska.imagebrowser.data.repository.ImageRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

@OptIn(ExperimentalCoroutinesApi::class)
class SearchViewModelTest {

    private lateinit var sut: SearchViewModel

    // variables
    private val testDispatcher = StandardTestDispatcher()
    private var savedUsername: String? = null
    private var getImagesResponse: List<Image> = listOf()

    // mocks
    private val mockSavedStateHandle: SavedStateHandle = mock {
        on { get<String?>("username") } doAnswer { savedUsername }
    }

    private val mockImageRepository: ImageRepository = mock {
        onBlocking { this.getImages() } doAnswer { getImagesResponse }
        onBlocking { this.getUsersImages(any()) } doAnswer { getImagesResponse }
    }

    @Test
    fun `test init when searching all images should call getImages`() = runTest(testDispatcher) {
        savedUsername = null
        Dispatchers.setMain(testDispatcher)
        sut = SearchViewModel(mockSavedStateHandle, mockImageRepository)
        this.runCurrent()
        verify(mockImageRepository, times(1)).getImages()
    }

    @Test
    fun `test init when searching images for user should call getUsersImages`() =
        runTest(testDispatcher) {
            savedUsername = "Test"
            Dispatchers.setMain(testDispatcher)
            sut = SearchViewModel(mockSavedStateHandle, mockImageRepository)
            this.runCurrent()
            verify(mockImageRepository, times(1)).getUsersImages("Test")
        }

    @Test
    fun `test init should update the state`() = runTest(testDispatcher) {
        savedUsername = null
        getImagesResponse = listOf(EmptyImage)
        Dispatchers.setMain(testDispatcher)
        sut = SearchViewModel(mockSavedStateHandle, mockImageRepository)
        assertEquals(SearchState(listOf()), sut.state.value)
        this.runCurrent()
        verify(mockImageRepository, times(1)).getImages()
        runCurrent()
        assertEquals(SearchState(listOf(EmptyImage)), sut.state.value)
    }

    @Test
    fun `test handle onClick should emit NavigateToImage effect with given id`() =
        runTest(testDispatcher) {
            Dispatchers.setMain(testDispatcher)
            sut = SearchViewModel(mockSavedStateHandle, mockImageRepository)
            runCurrent()
            val effects = mutableListOf<SearchEffect>()
            val collectEffectsJob = sut.effect
                .onEach { effects.add(it) }
                .launchIn(this)

            sut.handle(SearchEvent.OnClick("test_id"))
            runCurrent()
            assertEquals(listOf(SearchEffect.NavigateToImage("test_id")), effects)

            collectEffectsJob.cancel()
        }

    @Test
    fun `test handle loadImage should call repository getImages`() =
        runTest(testDispatcher) {
            Dispatchers.setMain(testDispatcher)
            sut = SearchViewModel(mockSavedStateHandle, mockImageRepository)
            runCurrent()

            sut.handle(SearchEvent.LoadImages)
            runCurrent()

            // 1st. Init
            // 2nd. Handle
            verify(mockImageRepository, times(2)).getImages()
        }

    @Test
    fun `test handle LoadUserImages should call repository getUsersImages`() =
        runTest(testDispatcher) {
            Dispatchers.setMain(testDispatcher)
            sut = SearchViewModel(mockSavedStateHandle, mockImageRepository)
            runCurrent()

            sut.handle(SearchEvent.LoadUsersImages("testUser"))
            runCurrent()

            verify(mockImageRepository, times(1)).getUsersImages("testUser")
        }

    companion object {

        private val EmptyImage = ImageDto(
            id = "",
            description = null,
            urls = UrlsDto("", "", "", "", ""),
            user = UserDto("", "", "")
        ).toImage()

    }

}