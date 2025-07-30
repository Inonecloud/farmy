package com.farmy.service.dto.shop

data class AddShopCommand(
    val name:String,
    val address:String,
    val description:String,
    val owner:String,
)

data class AddShopDocument(
    val success: Boolean,
)