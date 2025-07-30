package com.farmy.controller

import com.farmy.service.ShopService
import com.farmy.service.dto.shop.AddShopCommand
import com.farmy.service.dto.shop.AddShopDocument
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/shop")
class ShopController(
    private val shopService: ShopService
) {

    @PostMapping("/add")
    fun addNewShop(@RequestBody command: AddShopCommand): AddShopDocument {
        return shopService.addShop(command)
    }

}