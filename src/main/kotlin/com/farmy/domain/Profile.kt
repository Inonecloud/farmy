package com.farmy.domain

import jakarta.persistence.*
import java.time.Instant

@Entity
data class Profile(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    val user: User? = null,
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val dateOfBirth: Instant,

    @OneToMany(mappedBy = "profile",cascade = [CascadeType.ALL])
    val deliveryAddresses: List<Address>,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    val cart: Cart? = null,



    )
