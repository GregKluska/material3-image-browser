package com.gregkluska.imagebrowser.feature.search

sealed interface SearchEffect {

    data class NavigateToImage(
        val imageId: String
    ) : SearchEffect

}