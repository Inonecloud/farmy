package com.farmy.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import java.math.BigDecimal

@Entity
data class CartItem(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String,

    val productId: Long,

    val quantity: Int,

    val price: BigDecimal,

    @OneToOne()
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    val cart: Cart,
)
