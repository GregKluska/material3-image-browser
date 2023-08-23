package com.gregkluska.imagebrowser.data.repository

import com.gregkluska.imagebrowser.core.model.Image
import com.gregkluska.imagebrowser.data.model.toImage
import com.gregkluska.imagebrowser.data.network.UnsplashService
import javax.inject.Inject

class ImageRepository
@Inject
constructor(
    private val unsplashService: UnsplashService
) {

    suspend fun getImages(): List<Image> {
        return unsplashService.getPhoto().map { it.toImage() }
    }

    suspend fun getUsersImages(username: String): List<Image> {
        return unsplashService.getUsersPhoto(username).map { it.toImage() }
    }

    suspend fun getImage(imageId: String): Image {
        return unsplashService.getPhoto(imageId).toImage()
    }
}