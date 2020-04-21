package com.example.kubedemo.controller

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class HelloController {

    private val rest: RestTemplate = RestTemplateBuilder().build()

    @GetMapping("/")
    fun hello(): String {
        return "Hello, there. My name is ${System.getenv("HOSTNAME")}."
    }
}