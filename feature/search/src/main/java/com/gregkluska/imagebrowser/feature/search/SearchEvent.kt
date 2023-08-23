package com.gregkluska.imagebrowser.feature.search

sealed interface SearchEvent {

    data class OnClick(
        val id: String
    ) : SearchEvent

    object LoadImages : SearchEvent

    data class LoadUsersImages(
        val username: String
    ) : SearchEvent
}