package com.farmy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FarmyApplication

fun main(args: Array<String>) {
    runApplication<FarmyApplication>(*args)
}
