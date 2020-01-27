package com.kafka.kafkakotlinconsumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkakotlinconsumerApplication

fun main(args: Array<String>) {
    runApplication<KafkakotlinconsumerApplication>(*args)
}
