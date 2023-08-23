package com.gregkluska.imagebrowser.feature.search

sealed interface SearchEffect {

    data class ImageClick(
        val imageId: String
    ) : SearchEffect

}