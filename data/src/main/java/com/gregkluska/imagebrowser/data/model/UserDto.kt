package com.gregkluska.imagebrowser.data.model

import com.gregkluska.imagebrowser.core.model.User
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val id: String,
    val username: String,
)

fun UserDto.toUser(): User {
    return User(
        id = this.id,
        name = this.username
    )
}