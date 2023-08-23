package com.gregkluska.imagebrowser.feature.search

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.data.repository.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
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

    private val viewModelEffect = MutableSharedFlow<SearchEffect>()

    val effect: SharedFlow<SearchEffect>
        get() = viewModelEffect

    init {
        handle(SearchEvent.LoadImages(""))
    }

    fun handle(event: SearchEvent) {
        Log.d(TAG, "handle: called with $event")
        when(event) {
            is SearchEvent.OnClick -> {
                openImage(event.id)
            }
            is SearchEvent.LoadImages -> {
                loadImages(event.query)
            }
        }
    }

    private fun openImage(id: String) {
        // Analytics, logging, etc..
        viewModelScope.launch {
            viewModelEffect.emit(SearchEffect.ImageClick(id))
        }
    }

    private fun loadImages(query: String) {
        viewModelScope.launch {
            val images = imageRepository.getImages()

            viewModelState.value = viewModelState.value.copy(images = images)
        }
    }
    
    companion object {
        private const val TAG = "SearchViewModel"
    }
}