package com.farmy.service.dto.user

import java.time.Instant

data class CreateUserCommand(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val dateOfBirth: Instant?,
    val phoneNumber: String,
    )

data class CreateUserDocument(
    val success: Boolean,
)