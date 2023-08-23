package com.gregkluska.imagebrowser.feature.detail

sealed interface DetailEffect {

    data class NavigateToUsersImages(
        val username: String
    ) : DetailEffect

}