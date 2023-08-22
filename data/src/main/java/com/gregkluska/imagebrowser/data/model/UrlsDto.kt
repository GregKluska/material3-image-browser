package com.gregkluska.imagebrowser.data.model

import kotlinx.serialization.Serializable

@Serializable
data class UrlsDto(
    val raw: String,
    val full: String,
    val regular: String,
    val small: String,
    val thumb: String
)