package com.kafka.kafkakotlinconsumer.usecase.listener

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {

    @KafkaListener(topics = ["Kafka_Person",
        "com.vela.salamtakaful.event.policy-certification-generation",
    "com.vela.salamtakaful.event.policy-certification-generation-done",
    "com.vela.salamtakaful.event.test"], groupId = "group_id")
    fun consume(message: String) {
        println("Consumed message = $message")
    }
}