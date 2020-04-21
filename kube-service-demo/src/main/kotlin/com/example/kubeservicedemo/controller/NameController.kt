package com.example.kubeservicedemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NameController {

    private val names = listOf("Jim", "Pam", "Michael", "Dwight", "Oscar", "Kevin", "Stanley", "Angela", "Kelly", "Meredith", "Ryan", "Toby", "Robert California")

    @GetMapping("/")
    fun getName(): String {
        return  names.random()
    }
}