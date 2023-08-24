package com.gregkluska.imagebrowser.data.model

import com.gregkluska.imagebrowser.core.model.Image
import kotlinx.serialization.Serializable

@Serializable
data class ImageDto(
    val id: String,
    val description: String?,
    val tags: List<TagDto> = listOf(),
    val urls: UrlsDto,
    val user: UserDto
)

fun ImageDto.toImage(): Image {
    return Image(
        id = id,
        url = this.urls.full,
        tags = this.tags.map { it.title },
        author = this.user.toUser(),
        description = description ?: ""
    )
}