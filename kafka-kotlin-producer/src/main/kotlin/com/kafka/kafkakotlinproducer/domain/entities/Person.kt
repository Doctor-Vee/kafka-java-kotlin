package com.kafka.kafkakotlinproducer.domain.entities

class Person{
    var name: String
    var age: Int
    lateinit var address: String

    constructor(name: String, address: String){
        this.name = name
        this.age = name.length * 10
        this.address = address
    }
}
