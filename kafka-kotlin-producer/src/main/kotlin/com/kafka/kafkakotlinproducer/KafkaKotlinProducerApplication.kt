package com.kafka.kafkakotlinproducer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaKotlinProducerApplication

fun main(args: Array<String>) {
    runApplication<KafkaKotlinProducerApplication>(*args)
}
