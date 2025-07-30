package com.farmy.service.dto.product

import java.math.BigDecimal

data class AddProductCommand(
    val name: String,
    val description: String,
    val category: String,
    val price: BigDecimal,
    val quantity: Int,
)

data class AddProductDocument(
    val success: Boolean,
)