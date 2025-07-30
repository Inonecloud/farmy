package com.farmy.service

import com.farmy.repository.ProductRepository
import com.farmy.service.dto.product.GetProductsDocument
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class ProductsService(
    private val productRepository: ProductRepository) {


    fun getAllProducts(): GetProductsDocument {
        val pageable = PageRequest.of(0, 10, Sort.by("name"))
        val products = productRepository.findAll(pageable)
        return GetProductsDocument(TODO())
    }
}