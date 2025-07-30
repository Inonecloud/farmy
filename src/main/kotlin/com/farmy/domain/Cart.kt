package com.farmy.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import java.math.BigDecimal

@Entity
data class Cart(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String,

    @OneToOne(mappedBy = "cart")
    val user: Profile? = null,

    @OneToOne(mappedBy = "cart")
    val cartItem: CartItem,

    val totalAmount: BigDecimal = BigDecimal.ZERO,

)
