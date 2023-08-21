package com.gregkluska.imagebrowser.feature.search

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor() : ViewModel() {

    private val viewModelState: MutableState<SearchState> = mutableStateOf(SearchState(listOf()))

    val state: State<SearchState>
        get() = viewModelState
}