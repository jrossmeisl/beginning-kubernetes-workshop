package com.example.kubedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubeDemoApplication

fun main(args: Array<String>) {
	runApplication<KubeDemoApplication>(*args)
}
