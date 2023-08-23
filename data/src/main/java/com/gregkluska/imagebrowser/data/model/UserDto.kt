package com.gregkluska.imagebrowser.data.model

import com.gregkluska.imagebrowser.core.model.User
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    val id: String,
    val username: String,
    val name: String
)

fun UserDto.toUser(): User {
    return User(
        id = this.id,
        username = this.username,
        name = this.name,
    )
}