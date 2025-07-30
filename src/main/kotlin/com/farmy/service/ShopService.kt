package com.farmy.service

import com.farmy.domain.Shop
import com.farmy.repository.ShopRepository
import com.farmy.service.dto.shop.AddShopCommand
import com.farmy.service.dto.shop.AddShopDocument
import org.springframework.stereotype.Service

@Service
class ShopService(
    private val shopRepository: ShopRepository
) {

    fun addShop(command: AddShopCommand):AddShopDocument {
        var shop = Shop(command.name, command.description, command.address, command.owner)
        shopRepository.save(shop)
        return AddShopDocument(true)
    }

}