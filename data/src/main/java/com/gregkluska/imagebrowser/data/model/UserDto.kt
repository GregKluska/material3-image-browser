package com.gregkluska.imagebrowser.data.model

import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val id: String,
    val username: String,
)