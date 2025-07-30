package com.farmy.controller

import com.farmy.service.UserService
import com.farmy.service.dto.user.CreateUserCommand
import com.farmy.service.dto.user.CreateUserDocument
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["http://localhost:4200"])
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService
) {

    @PostMapping("/signup")
    fun signUp(@RequestBody command: CreateUserCommand): CreateUserDocument{
        return CreateUserDocument(true)
    }


}