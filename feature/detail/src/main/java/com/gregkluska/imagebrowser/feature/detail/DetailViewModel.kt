package com.gregkluska.imagebrowser.feature.detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.data.repository.ImageRepository
import com.gregkluska.imagebrowser.feature.detail.navigation.argImageId
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

data class DetailState(
    val image: Image? = null
)

@HiltViewModel
class DetailViewModel
@Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: ImageRepository
) : ViewModel() {

    private val imageId: String = checkNotNull(savedStateHandle[argImageId])

    private val viewModelState: MutableState<DetailState> = mutableStateOf(DetailState())

    val state: State<DetailState>
        get() = viewModelState

    init {
        handle(DetailEvent.LoadImage(imageId))
    }

    fun handle(event: DetailEvent) {
        when (event) {
            is DetailEvent.LoadImage -> {
                loadImage(event.imageId)
            }
        }
    }

    private fun loadImage(imageId: String) {
        viewModelScope.launch {
            val image = repository.getImage(imageId)
            viewModelState.value = viewModelState.value.copy(image = image)
        }
    }

}