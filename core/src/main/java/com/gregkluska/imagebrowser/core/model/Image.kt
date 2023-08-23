package com.gregkluska.imagebrowser.core.model

data class Image(
    val id: String,
    val url: String,
    val author: User,
    val description: String
)
