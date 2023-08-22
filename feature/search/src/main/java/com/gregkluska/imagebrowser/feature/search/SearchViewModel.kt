package com.gregkluska.imagebrowser.feature.search

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.data.repository.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

data class SearchState(
    val images: List<Image>
)

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val imageRepository: ImageRepository
) : ViewModel() {

    private val viewModelState: MutableState<SearchState> = mutableStateOf(SearchState(listOf()))

    val state: State<SearchState>
        get() = viewModelState

    init {
        handle(SearchEvent.LoadImages(""))
    }

    fun handle(event: SearchEvent) {
        when(event) {
            is SearchEvent.OnClick -> {
                // Not implemented
            }
            is SearchEvent.LoadImages -> {
                getImages(event.query)
            }
        }
    }

    private fun getImages(query: String) {
        viewModelScope.launch {
            val images = imageRepository.getImages()

            viewModelState.value = viewModelState.value.copy(images = images)
        }
    }
}