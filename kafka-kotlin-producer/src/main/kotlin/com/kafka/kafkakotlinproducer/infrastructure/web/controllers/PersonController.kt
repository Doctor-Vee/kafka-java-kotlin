package com.kafka.kafkakotlinproducer.infrastructure.web.controllers

import com.kafka.kafkakotlinproducer.domain.entities.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/kafka")
class PersonController {
    @Autowired
    lateinit var kafkaTemplate: KafkaTemplate<String, Person>;

    val TOPIC: String = "Kafka_Person"

    @PostMapping("/person")
    fun post(@RequestBody person: Person): String{
        kafkaTemplate.send(TOPIC, person)
        return "Successfully published"
    }
}