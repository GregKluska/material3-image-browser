package com.gregkluska.imagebrowser.feature.detail

sealed interface DetailEvent {

    data class LoadImage(
        val imageId: String
    ) : DetailEvent

    object OnUserClick : DetailEvent
}