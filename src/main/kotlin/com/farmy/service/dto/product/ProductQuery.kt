package com.farmy.service.dto.product

import com.farmy.domain.Currency
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.math.BigDecimal

data class GetProductsQuery(
    val pageable: Pageable,
)

data class GetProductsDocument(
    val products: Page<ProductDto>,
)

data class ProductDto(
    val name: String,
    val description: String,
    val price: BigDecimal,
    val currency: Currency,
    val shop: String,
)