package com.farmy.domain

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne
import java.math.BigDecimal
import java.time.Instant

@Entity
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    val name: String,

    val description: String,

    @ManyToOne
    @JoinColumn(name = "shop_id")
    val shop: Shop? = null,

    val price: BigDecimal = BigDecimal.ZERO,

    @Enumerated(EnumType.STRING)
    val currency: Currency = Currency.EUR,

    val quantity: Int = 0,

    @ManyToMany(mappedBy = "products")
    val categories: List<Category> = emptyList(),

    val created: Instant = Instant.now(),

    val updated: Instant = Instant.now(),

)
