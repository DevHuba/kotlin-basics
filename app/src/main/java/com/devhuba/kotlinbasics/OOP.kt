package com.devhuba.kotlinbasics

fun main() {
    val person1 = Persone("Aleks","Huba")
    val person2 = Persone()
    val person3 = Persone(firstName = "Bazilik")
}

class Persone(firstName: String = "John", lastName: String = "Doe"){

    init {
        println("Person : $firstName $lastName")
    }
}