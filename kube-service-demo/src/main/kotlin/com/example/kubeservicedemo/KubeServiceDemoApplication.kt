package com.example.kubeservicedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubeServiceDemoApplication

fun main(args: Array<String>) {
	runApplication<KubeServiceDemoApplication>(*args)
}
