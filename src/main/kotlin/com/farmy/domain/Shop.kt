package com.farmy.domain

import jakarta.persistence.*
import java.time.Instant


@Entity
data class Shop(
    val name: String,
    val description: String,
    val address: String = "",
    val owner: String = "",
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @OneToMany(mappedBy = "shop", cascade = [CascadeType.ALL])
    val product: List<Product?> = emptyList()
    val created: Instant = Instant.now()
    val updated: Instant = Instant.now()
}

