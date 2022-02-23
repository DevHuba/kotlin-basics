package com.devhuba.kotlinbasics

fun main() {
    val age = 10
    when {
        age in 16..17 -> {
            println("You may ride a car !")
        }
        age in 18..20 -> {
            println("You may vote !")
        }
        age >= 21 -> {
            println("You may drink !")
        }
        else -> {
            println("You`r too young for that shit !!")
        }
    }
}