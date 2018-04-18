package com.objectpartners.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class MyKotlinApplication {

}

fun main(args: Array<String>) {
	SpringApplication.run(MyKotlinApplication::class.java, *args)
}
