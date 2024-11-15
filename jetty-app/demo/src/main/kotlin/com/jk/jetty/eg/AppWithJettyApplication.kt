package com.jk.jetty.eg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppWithJettyApplication

fun main(args: Array<String>) {
	runApplication<AppWithJettyApplication>(*args)
}
