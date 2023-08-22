package com.gregkluska.imagebrowser.feature.search

sealed interface SearchEvent {

    data class OnClick(
        val id: String
    ): SearchEvent

    data class LoadImages(
        val query: String
    ): SearchEvent
}