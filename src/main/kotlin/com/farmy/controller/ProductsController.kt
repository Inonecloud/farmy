package com.farmy.controller

import com.farmy.service.ProductsService
import com.farmy.service.dto.product.GetProductsDocument
import com.farmy.service.dto.product.GetProductsQuery
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/products")
class ProductsController(
    private val productsService: ProductsService
) {

    @PostMapping
    fun getAllProducts(@RequestBody query: GetProductsQuery): GetProductsDocument {
       return productsService.getAllProducts()
    }
}