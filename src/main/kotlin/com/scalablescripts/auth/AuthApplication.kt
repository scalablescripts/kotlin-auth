package com.scalablescripts.auth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class AuthApplication

fun main(args: Array<String>) {
    runApplication<AuthApplication>(*args)
}
