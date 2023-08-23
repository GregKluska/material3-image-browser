package com.gregkluska.imagebrowser.data.model

import com.gregkluska.imagebrowser.core.model.Image
import kotlinx.serialization.Serializable

@Serializable
data class ImageDto(
    val id: String,
    val likes: Int,
    val tag: List<TagDto> = listOf(),
    val urls: UrlsDto,
    val user: UserDto
)

fun ImageDto.toImage(): Image {
    return Image(
        id = id,
        url = this.urls.full,
        author = this.user.toUser(),
        description = "N/A"
    )
}