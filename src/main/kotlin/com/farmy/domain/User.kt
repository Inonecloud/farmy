package com.farmy.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.time.Instant

@Entity
@Table(name = "users")
data class User(
    val email: String,
    val password: String,
    val authority: String,
    @OneToOne(mappedBy = "user")
    val profile: Profile? = null,
    val deactivated: Boolean,
    val created: Instant = Instant.now(),
    val updated: Instant = Instant.now(),
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
}
