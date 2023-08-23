package com.gregkluska.imagebrowser.feature.detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.gregkluska.imagebrowser.core.model.Image
import dagger.hilt.android.lifecycle.HiltViewModel

data class DetailState(
    val image: Image? = null
)

@HiltViewModel
class DetailViewModel: ViewModel() {

    private val viewModelState: MutableState<DetailState> = mutableStateOf(DetailState())

    val state: State<DetailState>
        get() = viewModelState

    init {

    }

    fun handle(event: DetailEvent) {
        when(event) {
            else -> {}
        }
    }

}